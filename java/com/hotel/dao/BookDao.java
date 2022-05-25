package com.hotel.dao;

import com.hotel.model.Book;
import com.hotel.utils.Pager;

import java.util.List;


public interface BookDao extends BaseDao<Book> {

    /**
     * @Description (TODO这里用一句话描述这个方法的作用)
     * @return
     */
    Pager<Book> listAll();

    Book bookDetail(int bookId);

    /**
     * @Description (TODO这里用一句话描述这个方法的作用)
     * @return
     */
    Pager<Book> listAllLive();

    /**
     * @Description (TODO这里用一句话描述这个方法的作用)
     * @param roomCatName
     * @return
     */
    List<Book> roomInfo(String roomCatName);


}
