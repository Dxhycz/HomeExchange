package main.java.servlet;

import main.java.Model.User;
import main.java.Service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

@WebServlet("/userServlet")
public class UserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getParameter("action");
        try {
            Class<? extends UserServlet> clazz = this.getClass();
            Method method = clazz.getMethod(action,HttpServletRequest.class,HttpServletResponse.class);
            if(method!=null) {

                String returns=(String) method.invoke(this, req,resp);

                if(returns != null) {
                    if("/xf.jsp".equals(returns)) {
                        req.getRequestDispatcher(returns).forward(req, resp);
                    }else {
                        req.setAttribute("show", returns);
                        req.getRequestDispatcher("/login.jsp").forward(req, resp);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 处理登录请求
    public String login(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
        UserService us = new UserService();
        Map obj = us.loginUser(req.getParameter("userName"),req.getParameter("password"));
        if(obj != null) {
            req.getSession().setAttribute("userId",obj.get("id"));
            req.getSession().setAttribute("userName",obj.get("userName"));
            req.getSession().setAttribute("email",obj.get("email"));
            return "/xf.jsp";
        }else {
            return "Register Failed！";
        }
    }

    // 处理注册请求
    public String register(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
        User user = new User(req.getParameter("userName"),req.getParameter("password"),req.getParameter("firstName"),req.getParameter("lastName"),req.getParameter("email"));
        UserService us = new UserService();
        boolean obj = false;
        if(us != null) {
            obj = us.register(user);
        }
        if(obj) {
            return "Register Successes！";
        }else {
            return "Register Failed！";
        }
    }
}
