package com.yawei.dao;

import com.yawei.pojo.BookType;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class BookTypeDao {
    @Inject
    private SessionFactory sessionFactory;

    private Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    public List<BookType> findAllBookType(){
        Criteria criteria = getSession().createCriteria(BookType.class);
        criteria.addOrder(Order.desc("id"));
        return criteria.list();
    }
}
