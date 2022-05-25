package com.hotel.dao.impl;

import com.hotel.dao.NeedDao;
import com.hotel.model.Need;
import com.hotel.utils.Pager;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Repository("needDao")
@SuppressWarnings("unchecked")
public class NeedDaoImpl extends BaseDaoImpl<Need>  implements NeedDao{

	@Override
	public Pager<Need> listAll() {
		 String hql = "from Need";
	       Map<String,Object> alias = new HashMap<String,Object>();
	       return findByAlias(hql, null);
	}

	
	
}
