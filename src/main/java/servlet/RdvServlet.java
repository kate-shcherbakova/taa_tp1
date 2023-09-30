package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import dao.RdvDao;
import dao.ProfDao;
import dao.StudentDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jpa.business.Student;
import jpa.business.Prof;
import jpa.business.Rdv;

@WebServlet(name = "add_rdv",
        urlPatterns = {"/add_rdv"})
public class RdvServlet extends HttpServlet {

    RdvDao rdvDao;
    StudentDao studentDao;
    ProfDao profDao;


    @Override
    public void init() throws ServletException {
        super.init();
        this.rdvDao = new RdvDao();
        this.studentDao = new StudentDao();
        this.profDao = new ProfDao();

    }

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws ServletException, IOException {

        String title = request.getParameter("title");
        Long duration = Long.parseLong(request.getParameter("duration"));
        String profId = request.getParameter("profId");
        String studentId = request.getParameter("studentId");

        Prof prof = profDao.findOne(Long.parseLong(profId));
        Student student = studentDao.findOne(Long.parseLong(studentId));

        if (prof == null || student == null) {
            String errorMessage = "Professor or student with provided ID not found!";
            String script = "<script type='text/javascript'>alert('" + errorMessage + "');"
                    + "window.location.href='index.html';</script>";

            response.getWriter().write(script);
            return;
        }

        Rdv rdv = new Rdv(title, duration);
        rdv.setProf(prof);
        rdv.setStudent(student);

        try {
            rdvDao.save(rdv);
        } catch (Exception e) {
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Database error");
        }

        response.sendRedirect("index.html");
    }
}
