
package main.java.servlet;
import main.java.Dao.HouseDao;
import main.java.Model.House;
import main.java.Util.SendEmailUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/sendServlet")
public class SendServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Object email = request.getSession().getAttribute("email");
        if(email == null){
            response.sendRedirect("login.jsp");
            return;
        }
        request.setCharacterEncoding("utf-8");
        String houseId = request.getParameter("houseId");
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
        h.setHouseId(houseId);
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
        SendEmailUtil.sendMail(email.toString(),h.getCity()+"-"+h.getCountry()+"-"+h.getHouse_type(),h.getDescription());
        redirect(request,response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    private void redirect(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HouseDao hd = new HouseDao();
        List<House> list =new ArrayList<>();
        try {
            list = hd.getAllHouse();
        } catch (Exception e) {
            e.printStackTrace();
        }

        request.setAttribute("list", list);
        request.getRequestDispatcher("HouseInfo.jsp").forward(request, response);
    }
}
