package com.hotel.service;

import com.hotel.model.Item;
import com.hotel.utils.Pager;

public interface ItemService {

    /**
     * @Description (TODO show all of the items)
     * @return
     */
    Pager<Item> listAll();

    /**
     * @Description (TODO add items)
     * @param item
     */
    void add(Item item);

    /**
     * @Description (TODO delete items)
     * @param itemId
     */
    void delItem(int itemId);

    /**
     * @Description (TODO show the details of items)
     * @param itemId
     * @return
     */
    Item itemDetail(int itemId);

    /**
     * @Description (TODO update the info of items)
     * @param item
     */
    void update(Item item);





}
