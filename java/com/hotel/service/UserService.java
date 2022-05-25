package com.hotel.service;

import com.hotel.model.User;
import com.hotel.utils.Pager;

import java.util.List;

public interface UserService {
	public List<User> listAllCanSendUser(int userId);

	public void add(User user);

	public User load(User user);

	public User getUser(int userId);

	public List<User> findFriend(String userName, int myId);

	public User loadUserById(int userId);

	public Pager<User> listAll(String userName);

	public void delUse(int userId);

	public List<User> findSYuser();

	public List<User> findBYuser();

    /**
     * @Description (TODO show all of the users)
     * @return
     */
    public Pager<User> listAll();

    /**
     * @Description (TODO show the detailed infos of users)
     * @param userId
     * @return 
     */
    public User userDetail(int userId);

}
