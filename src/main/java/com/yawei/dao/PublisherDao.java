package com.yawei.dao;


import com.yawei.pojo.Publisher;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class PublisherDao {
    @Inject
    private SessionFactory sessionFactory;

    private Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    public List<Publisher> findAllPublisher(){
        Criteria criteria = getSession().createCriteria(Publisher.class);
        criteria.addOrder(Order.desc("id"));
        return criteria.list();
    }
}
