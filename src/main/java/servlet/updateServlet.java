package main.java.servlet;
import main.java.Dao.HouseDao;
import main.java.Model.House;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/updateServlet")
public class updateServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String idStr = request.getParameter("houseId");
        if (idStr != null && !idStr.equals("")) {
            int houseId = Integer.valueOf(idStr);
            HouseDao hd = new HouseDao();
            House house = null;
            try {
                house = hd.selectHouse(houseId);
            } catch (Exception e) {
                e.printStackTrace();
            }
            request.setAttribute("house", house);
        }
        request.getRequestDispatcher("update.jsp").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String code_postal = request.getParameter("code_postal");
        String country = request.getParameter("country");
        String date_start = request.getParameter("date_start");
        String date_fin = request.getParameter("date_fin");
        String num_people = request.getParameter("num_people");
        String house_type = request.getParameter("house_type");
        String description = request.getParameter("description");
        House h = new House();
        h.setAdress(address);
        h.setCity(city);
        h.setCode_postal(code_postal);
        h.setCountry(country);
        h.setDate_start(date_start);
        h.setDate_fin(date_fin);
        h.setNum_people(num_people);
        h.setHouse_type(house_type);
        h.setDescription(description);
        HouseDao hd = new HouseDao();
        try {
            hd.addHouse(h);
        } catch (Exception e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("showServlet").forward(request,response);
    }

}
