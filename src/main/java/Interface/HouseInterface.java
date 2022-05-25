package main.java.Interface;

import main.java.Model.House;

import java.util.List;

public interface HouseInterface {
    public List<House> getAllHouse() throws Exception;
    public boolean addHouse(House house) throws Exception;
    public boolean updateHouse(House house) throws Exception;
    public boolean deleteHouse(int houseId) throws Exception;
    public House selectHouse( int houseId) throws Exception;
}
