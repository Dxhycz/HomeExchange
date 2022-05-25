package main.java.servlet;
import main.java.Dao.HouseDao;
import main.java.Model.House;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addServlet")
public class AddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
        request.getRequestDispatcher("showServlet").forward(request,response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
