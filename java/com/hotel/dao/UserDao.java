package com.hotel.dao;


import com.hotel.model.User;
import com.hotel.utils.Pager;

public interface UserDao extends BaseDao<User>{

    /**
     * @Description (TODO这里用一句话描述这个方法的作用)
     * @return
     */
    Pager<User> listAll();

    /**
     * @Description (TODO这里用一句话描述这个方法的作用)
     * @param userId
     * @return
     */
    User userDetail(int userId);

}
