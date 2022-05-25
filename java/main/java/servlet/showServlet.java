package main.java.servlet;
import main.java.Dao.HouseDao;
import main.java.Model.House;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/showServlet")
public class showServlet extends HttpServlet {
    public class ShowServlet extends HttpServlet {
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.setCharacterEncoding("utf-8");

            HouseDao hd = new HouseDao();
            List<House> list = null;
            try {
                list = hd.getAllHouse();
            } catch (Exception e) {
                e.printStackTrace();
            }

            request.setAttribute("list", list);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request, response);
        }
    }
}
