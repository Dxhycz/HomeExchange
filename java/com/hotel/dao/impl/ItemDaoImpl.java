package com.hotel.dao.impl;

import com.hotel.dao.ItemDao;
import com.hotel.model.Item;
import com.hotel.utils.Pager;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

@Repository("itemDao")
@SuppressWarnings("unchecked")
public class ItemDaoImpl  extends BaseDaoImpl<Item> implements ItemDao {

    
    @Override
    public Pager<Item> listAll() {
        String hql = "from Item ";
        return  findByAlias(hql, null);
    }

    @Override
    public Item itemDetail(int itemId) {
        String hql = "from Item bean where bean.id=:itemId";
        Query q =this.getSession().createQuery(hql);
        q.setParameter("itemId", itemId);
        return (Item) q.uniqueResult();
    }



	
}
