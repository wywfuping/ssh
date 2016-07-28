package com.yawei.dao;

import com.yawei.pojo.Book;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class BookDao {

    @Inject
    private SessionFactory sessionFactory;

    private Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    public void saveBook(Book book){
        getSession().saveOrUpdate(book);
    }

    public void delBook(Book book){
        getSession().delete(book);
    }

    public Book findById(Integer id){
        return (Book) getSession().get(Book.class,id);
    }

    public void delBookById(Integer id){
        getSession().delete(findById(id));
    }

    public List<Book> findAllBook(){
        Criteria criteria = getSession().createCriteria(Book.class);
        criteria.addOrder(Order.desc("id"));
        return criteria.list();
    }
}
