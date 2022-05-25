package com.hotel.service;

import com.hotel.model.Manage;
import com.hotel.utils.Pager;

import java.util.List;

public interface ManageService {

	Manage login(Manage manage);

    /**
     * @Description (TODO list all of the ads)
     * @return
     */
    Pager<Manage> listAll();

    /**
     * @Description (TODO delete the info of ads)
     * @param manageId
     */
    void delManage(int manageId);

    /**
     * @Description (TODO show the detailed info of ads)
     * @param manageId
     * @return
     */
    Manage manageDetail(int manageId);

    /**
     * @Description (TODO add ads)
     * @param manage
     */
    void add(Manage manage);

    /**
     * @Description (TODO update the infos of ads)
     * @param manage
     */
    void update(Manage manage);

    /**
     * @Description (TODO show the ads)
     * @return
     */
    List<Manage> list();

}
