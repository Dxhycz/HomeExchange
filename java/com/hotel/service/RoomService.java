package com.hotel.service;

import com.hotel.model.Room;
import com.hotel.utils.Pager;

import java.util.List;

public interface RoomService {

    
    Pager<Room> listAll();

    void add(Room room);

    void delRoom(int roomId);

    Room roomDetail(int roomId);
    
    void update(Room room);

    Pager<Room> listAllChangeRoom();

	List<Room> roomInfo(String roomCatName);

    /**
     * @Description (TODO offer house service after moving in)
     * @param roomId
     * @return
     */
    Room load(int roomId);

    /**
     * @Description (TODO )
     * @param id
     * @return
     */
    //List<Room> roomInfo(int id);

}
