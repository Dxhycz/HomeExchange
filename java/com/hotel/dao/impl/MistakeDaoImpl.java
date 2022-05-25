package com.hotel.dao.impl;

import com.hotel.dao.MistakeDao;
import com.hotel.model.Mistake;
import com.hotel.utils.Pager;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Repository("mistakeDao")
@SuppressWarnings("unchecked")
public class MistakeDaoImpl extends BaseDaoImpl<Mistake>  implements MistakeDao{

	@Override
	public Pager<Mistake> listAll() {
		 String hql = "from Mistake";
	       Map<String,Object> alias = new HashMap<String,Object>();
	       return findByAlias(hql, null);
	}

	
	
}
