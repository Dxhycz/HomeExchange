package main.java.Dao;

import main.java.Interface.UserInterface;
import main.java.Model.User;
import main.java.Util.jdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao implements UserInterface {
    private Connection conn;
    private ResultSet res;
    private PreparedStatement ps;
    //   登录验证
    @Override
    public boolean login(String userName, String password) {
        boolean ble = false;
        try {
            conn = jdbcUtils.getConn();
            String sql = "select * from user where userName=? and password=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,userName);
            ps.setString(2,password);
            //System.out.println(userName);
            res = ps.executeQuery();
            ble=res.next();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            jdbcUtils.closes(ps, conn, res);
        }
        return ble;
    }
    //  注册存储
    @Override
    public boolean register(User user) {
        boolean ble = false;
        try {
            conn = jdbcUtils.getConn();
            String sql = "insert into user(userName,password,firstName,lastName,email) value(?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, user.getUserName());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getLastName());
            ps.setString(4, user.getFirstName());
            ps.setString(5, user.getEmail());
            int flag = ps.executeUpdate();
            if (flag>0){
            ble=true;}
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            jdbcUtils.closes(ps, conn, res);
        }
        System.out.println("dao:"+ble);
        return ble;
    }
}
