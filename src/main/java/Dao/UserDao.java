package main.java.Dao;

import main.java.Interface.UserInterface;
import main.java.Model.User;
import main.java.Util.jdbcUtils;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

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

    @Override
    public Map<String, Object> loginUser(String name, String password) {
        try {
            conn = jdbcUtils.getConn();
            String sql = "select * from user where userName=? and password=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,name);
            ps.setString(2,password);
            //System.out.println(userName);
            res = ps.executeQuery();
            return handle(res);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            jdbcUtils.closes(ps, conn, res);
        }
        return null;
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


    public Map<String,Object> handle(ResultSet resultSet) throws SQLException {
        ResultSetMetaData metaData = resultSet.getMetaData();
        //列数量
        int columns = metaData.getColumnCount();
        Map<String,Object> data = new HashMap<>(16);
        while(resultSet.next()) {
            for (int i = 1; i <= columns; i++) {
                String columnName = metaData.getColumnName(i);
                Object object = resultSet.getObject(columnName);
                data.put(columnName, object);
            }
            break;
        }
        return data;
    }
}
