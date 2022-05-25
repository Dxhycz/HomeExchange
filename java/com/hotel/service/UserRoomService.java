package com.hotel.service;

import com.hotel.dto.MoneyDto;
import com.hotel.model.UserRoom;
import com.hotel.utils.Pager;

import java.util.List;



public interface UserRoomService {

	Pager<UserRoom> listAllUserRoom();

    /**
     * @Description (TODO delete the relations of user and house)
     * @param id
     */
    void delUserRoom(int id);

    /**
     * @Description (TODO add the relations of user and house)
     * @param userRoom
     */
    void addUserRoom(UserRoom userRoom);

    /**
     * @Description (TODO list all of the relations of user and house)
     * @param userName
     * @return
     */
    List<MoneyDto> listAll(String userName);

    /**
     * @Description (TODO list all of the rooms)
     * @param userName
     * @return
     */
    List<MoneyDto> listAllRoom(String userName);



	
}
