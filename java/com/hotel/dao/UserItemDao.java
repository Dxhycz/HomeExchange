package com.hotel.dao;


import com.hotel.model.UserItem;

import java.util.List;

public interface UserItemDao extends BaseDao<UserItem>{

    /**
     * @Description (TODO这里用一句话描述这个方法的作用)
     * @return
     */
    List<UserItem> listAll();

    /**
     * @Description (TODO这里用一句话描述这个方法的作用)
     * @param userName
     * @return
     */
    List<UserItem> listByName(String userName);





}
