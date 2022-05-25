package main.java.Util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class jdbcUtils {
    //  获取Connection连接对象
    public static Connection getConn() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/home_exchange";
        return DriverManager.getConnection(url,"root","123456");
    }
    //  释放资源
    public static void closes(PreparedStatement ps,Connection conn,ResultSet res) {
        try {
            if(ps != null) {ps.close();}
            if(conn != null) {conn.close();}
            if(res != null) {res.close();}
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
