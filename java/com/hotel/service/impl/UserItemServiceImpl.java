package com.hotel.service.impl;

import com.hotel.dao.UserItemDao;
import com.hotel.model.UserItem;
import com.hotel.service.UserItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userItemService")
public class UserItemServiceImpl implements UserItemService {
     @Autowired
     private UserItemDao userItemDao;

    @Override
    public List<UserItem> listAll(String userName) {
        if(userName == null || "".equals(userName)){
            return userItemDao.listAll();
        }else{
            return userItemDao.listByName(userName);
        }
    }





}
