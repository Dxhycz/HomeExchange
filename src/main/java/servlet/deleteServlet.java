package main.java.servlet;

import main.java.Dao.HouseDao;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deleteServlet")
public class deleteServlet extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String idStr = request.getParameter("houseId");
        int houseId = Integer.valueOf(idStr);
        HouseDao hd = new HouseDao();
        try {
            if (hd.deleteHouse(houseId)) {
                request.setAttribute("deleted", "deleted success！");
                request.getRequestDispatcher("showServlet").forward(request, response);
            } else {
                response.sendRedirect("showServlet");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
