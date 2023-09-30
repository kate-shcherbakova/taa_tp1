package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import dao.StudentDao;
import dao.ProfDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jpa.business.Student;
import jpa.business.Prof;
import jpa.business.User;


@WebServlet(name = "get_users",
        urlPatterns = {"/get_users"})
public class GetUsersServlet extends HttpServlet {

    StudentDao studentDao;
    ProfDao profDao;

    @Override
    public void init() throws ServletException {
        super.init();
        this.studentDao = new StudentDao();
        this.profDao = new ProfDao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> userList = new ArrayList<>();
        userList.addAll(studentDao.findAll());
        userList.addAll(profDao.findAll());

        response.setContentType("text/html");
        // to write the HTML response
        PrintWriter out = response.getWriter();

        // iterate through userList and generate table rows
        for (User user : userList) {
            out.println("<tr>");
            out.println("<td>" + user.getId() + "</td>");
            out.println("<td>" + user.getName() + "</td>");
            if (user instanceof Student) {
                out.println("<td>" + ((Student) user).getGroup() + "</td>");
                out.println("<td>" + "Student" + "</td>");
            } else if (user instanceof Prof) {
                out.println("<td>" + ((Prof) user).getDepartment() + "</td>");
                out.println("<td>" + "Professor" + "</td>");
            }
            out.println("</tr>");
        }

        out.close();
    }
}
