package servlet;

import java.io.IOException;

import dao.ProfDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jpa.business.Prof;


@WebServlet(name = "add_prof",
        urlPatterns = {"/add_prof"})
public class ProfServlet extends HttpServlet {

    ProfDao profDao;

    @Override
    public void init() throws ServletException {
        super.init();
        this.profDao = new ProfDao();
    }

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("profName");
        String department = request.getParameter("department");

        Prof prof = new Prof(name, department);

        try {
            profDao.save(prof);
        } catch (Exception e) {
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Database error");
        }

        response.sendRedirect("index.html");
    }
}
