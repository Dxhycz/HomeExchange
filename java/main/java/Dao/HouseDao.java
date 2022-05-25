package main.java.Dao;

import main.java.Interface.HouseInterface;
import main.java.Model.House;
import main.java.Util.jdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HouseDao implements HouseInterface {

    private Connection conn;
    private ResultSet res;
    private PreparedStatement ps;


    @Override
    public List<House> getAllHouse() throws Exception {
        List<House> list = new ArrayList<>();
        Connection conn = jdbcUtils.getConn();
        String sql = "select * from house";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                House house = new House();
                house.setHouseId(rs.getString("houseId"));
                house.setAdress(rs.getString("address"));
                house.setCity(rs.getString("city"));
                house.setCode_postal(rs.getString("code_postal"));
                house.setCountry(rs.getString("country"));
                house.setDate_start(rs.getString("data_state"));
                house.setDate_fin(rs.getString("data_fin"));
                house.setNum_people(rs.getString("num_people"));
                house.setDescription(rs.getString("description"));
                list.add(house);
            }
        }catch(Exception e){
                e.printStackTrace();
            }
        finally{
                jdbcUtils.closes(ps, conn, res);
            }
            return list;
    }

    @Override
    public boolean addHouse(House house) throws Exception {
        boolean flag = false;
        String sql = "insert into house(houseId,address, city, code_postal, country, date_start, date_fin, num_people, house_type, description) values(?,?,?,?,?,?,?,?,?,?,?)";
        Connection conn =jdbcUtils.getConn();
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, house.getHouseId());
            pst.setString(2, house.getAdress());
            pst.setString(3, house.getCity());
            pst.setString(4, house.getCode_postal());
            pst.setString(5, house.getCountry());
            pst.setString(6, house.getDate_start());
            pst.setString(7, house.getDate_fin());
            pst.setString(8, house.getNum_people());
            pst.setString(9, house.getHouse_type());
            pst.setString(10, house.getDescription());
            int count = pst.executeUpdate();
            if (count > 0) {
                flag = true;
            }
        }
            catch (Exception e){
            e.printStackTrace();
            }
            finally{
                jdbcUtils.closes(ps, conn, res);
            }
            return flag;
        }

    @Override
    public boolean updateHouse(House house) throws Exception {
        boolean flag=false;
        Connection conn =jdbcUtils.getConn();
        String sql="update house set address=?, city=?, code_postal=?, country=?, date_start=?, date_fin=?, num_people=?, house_type=?, description=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, house.getAdress());
            pst.setString(2, house.getCity());
            pst.setString(3, house.getCode_postal());
            pst.setString(4, house.getCountry());
            pst.setString(5, house.getDate_start());
            pst.setString(6, house.getDate_fin());
            pst.setString(7, house.getNum_people());
            pst.setString(8, house.getHouse_type());
            pst.setString(9, house.getDescription());
            int count = pst.executeUpdate();
            if (count > 0) {
                flag = true;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally{
            jdbcUtils.closes(ps, conn, res);
        }
        return flag;
    }

    @Override
    public boolean deleteHouse(int houseId) throws Exception {
        boolean flag=false;
        String sql="delete house where houseId=?";
        Connection conn =jdbcUtils.getConn();
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, houseId);
           int count = pst.executeUpdate();
            if (count > 0) {
                flag = true;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally{
            jdbcUtils.closes(ps, conn, res);
        }
        return flag;
    }

    @Override
    public House selectHouse(int houseId) throws Exception {
        String sql="select * from house where houseId=?";
        Connection conn =jdbcUtils.getConn();
        House house =null;
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                house = new House();
                house.setAdress(rs.getString("address"));
                house.setCity(rs.getString("city"));
                house.setCode_postal(rs.getString("code_postal"));
                house.setCountry(rs.getString("country"));
                house.setDate_start(rs.getString("data_state"));
                house.setDate_fin(rs.getString("data_fin"));
                house.setNum_people(rs.getString("num_people"));
                house.setDescription(rs.getString("description"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            jdbcUtils.closes(ps, conn, res);
        }
        return house;
    }
}
