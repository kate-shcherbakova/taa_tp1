package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import dao.RdvDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jpa.business.Rdv;

@WebServlet(name = "get_rdv",
        urlPatterns = {"/get_rdv"})
public class GetRdvServlet extends HttpServlet {

    RdvDao rdvDao;

    @Override
    public void init() throws ServletException {
        super.init();
        this.rdvDao = new RdvDao();

    }

//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        List<Rdv> rdvList = rdvDao.findAll();
//
//        System.out.println("RDV List HERE NEW: " + rdvList);
//
////         Convert the list of RDV objects to JSON and send it as the response
//        response.setContentType("application/json");
//        response.setCharacterEncoding("UTF-8");
//        response.getWriter().write(new Gson().toJson(rdvList));
//    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Rdv> rdvList = rdvDao.findAll();

        response.setContentType("text/html");
        // to write the HTML response
        PrintWriter out = response.getWriter();

        // iterate through rdvList and generate table rows
        for (Rdv rdv : rdvList) {
            out.println("<tr>");
            out.println("<td>" + rdv.getId() + "</td>");
            out.println("<td>" + rdv.getTitle() + "</td>");
            out.println("<td>" + rdv.getDuration() + "</td>");
            out.println("<td>" + rdv.getStudent().getName() + "</td>");
            out.println("<td>" + rdv.getProf().getName() + "</td>");
            out.println("</tr>");
        }

        out.close();
    }


}
