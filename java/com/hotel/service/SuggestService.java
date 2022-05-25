package com.hotel.service;

import com.hotel.model.Suggest;
import com.hotel.utils.Pager;

public interface SuggestService {

    /**
     * @Description (TODO add a suggestion for a specific house)
     * @param suggest
     */
    void add(Suggest suggest);

    /**
     * @Description (TODO show all of the suggestions)
     * @return
     */
    Pager<Suggest> listAll();

}
