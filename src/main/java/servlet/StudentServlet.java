package servlet;

import java.io.IOException;

import dao.StudentDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jpa.business.Student;

@WebServlet(name = "add_student",
        urlPatterns = {"/add_student"})
public class StudentServlet extends HttpServlet {

    StudentDao studentDao;

    @Override
    public void init() throws ServletException {
        super.init();
        this.studentDao = new StudentDao();
    }

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("studentName");
        String group = request.getParameter("group");

        Student student = new Student(name, group);

        try {
            studentDao.save(student);
        } catch (Exception e) {
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Database error");
        }

        response.sendRedirect("index.html");
    }
}
