package com.hotel.service;

import com.hotel.model.Book;
import com.hotel.utils.Pager;

import java.util.List;

public interface BookService {

    Pager<Book> listAll();

    Book bookDetail(int bookId);

    Pager<Book> listAllLive();

    
    void delBook(int bookId);

    /**
     * @Description (TODO update the booking info)
     * @param book
     */
    void updateBook(Book book);

    /**
     * @Description (TODO visualize the info of house)
     * @param roomCatName
     * @return
     */
    List<Book> roomInfo(String roomCatName);

    /**
     * @Description (TODO book the house)
     * @param bookId
     * @return
     */
    Book load(int bookId);


}
