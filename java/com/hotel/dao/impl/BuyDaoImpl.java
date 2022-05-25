package com.hotel.dao.impl;

import com.hotel.dao.BuyDao;
import com.hotel.model.Buy;
import com.hotel.utils.Pager;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Repository("buyDao")
@SuppressWarnings("unchecked")
public class BuyDaoImpl extends BaseDaoImpl<Buy>  implements BuyDao{

	@Override
	 public Pager<Buy> listAll() {
		 String hql = "from Buy";
       Map<String,Object> alias = new HashMap<String,Object>();
       return findByAlias(hql, null);
	}

	
	
}
