package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import dao.ProfDao;
import dao.RdvDao;
import dao.StudentDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jpa.business.Rdv;
import jpa.business.Student;

@WebServlet(name = "userinfo",
        urlPatterns = {"/userinfo"})
public class UserInfo extends HttpServlet {

    StudentDao studentDao;
    ProfDao profDao;
    RdvDao rdvDao;

    @Override
    public void init() throws ServletException {
        super.init();
        this.studentDao = new StudentDao();
        this.profDao = new ProfDao();
        this.rdvDao = new RdvDao();
    }

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws ServletException, IOException {

        Student student = new Student(request.getParameter("name"), request.getParameter("group"));
        studentDao.save(student);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>\n<body>\n" +
                "<h1>Recapitulatif des informations</h1>\n" +
                "<ul>\n" +
                " <li>Nom: "
                + request.getParameter("name") + "\n" +
                " <li>Prenom: "
                + request.getParameter("firstname") + "\n" +
                " <li>Age: "
                + request.getParameter("age") + "\n" +
                "</ul>\n" +
                "</body></html>");
    }
}