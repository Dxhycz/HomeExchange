package com.hotel.dao;

import com.hotel.model.Mistake;
import com.hotel.utils.Pager;

public interface MistakeDao extends BaseDao<Mistake>{

	Pager<Mistake> listAll();


}
