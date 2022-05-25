package com.hotel.dao;

import com.hotel.model.Room_cat;
import com.hotel.utils.Pager;

import java.util.List;

public interface RoomCatDao extends BaseDao<Room_cat>{

    /**
     * @Description (TODO这里用一句话描述这个方法的作用)
     * @return
     */
    Pager<Room_cat> listAll();

    /**
     * @Description (TODO这里用一句话描述这个方法的作用)
     * @return
     */
    List<Room_cat> list();

    /**
     * @Description (TODO这里用一句话描述这个方法的作用)
     * @param roomCatId
     * @return
     */
    Room_cat roomCatDetail(int roomCatId);


    /**
     * @Description (TODO这里用一句话描述这个方法的作用)
     * @param type
     * @return
     */
    Room_cat query(int type);



}
