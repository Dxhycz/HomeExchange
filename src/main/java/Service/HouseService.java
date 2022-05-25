package main.java.Service;

import main.java.Dao.HouseDao;
import main.java.Interface.HouseInterface;
import main.java.Model.House;

import java.util.List;

public class HouseService implements HouseInterface {
    HouseDao hd = new HouseDao();
    @Override
    public List<House> getAllHouse() throws Exception {
        return hd.getAllHouse();
    }

    @Override
    public boolean addHouse(House house) throws Exception {
        System.out.println(hd.addHouse(house));
        return false;
    }

    @Override
    public boolean updateHouse(House house) throws Exception {
        System.out.println(hd.updateHouse(house));
        return false;
    }

    @Override
    public boolean deleteHouse(int houseId) throws Exception {
        return false;
    }

    @Override
    public House selectHouse(int houseId) throws Exception {
        return null;
    }
}
