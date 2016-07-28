package com.yawei.service;

import com.yawei.dao.BookDao;
import com.yawei.dao.BookTypeDao;
import com.yawei.dao.PublisherDao;
import com.yawei.pojo.Book;
import com.yawei.pojo.BookType;
import com.yawei.pojo.Publisher;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@Transactional
public class BookService {
    @Inject
    private BookDao bookDao;
    @Inject
    private BookTypeDao bookTypeDao;
    @Inject
    private PublisherDao publisherDao;

    public void saveBook(Book book){
        bookDao.saveBook(book);
    }

    public void delBook(Integer id){
        bookDao.delBookById(id);
    }

    public List<Book> findAllBook(){
        return bookDao.findAllBook();
    }

    public Book findBookById(Integer id){
        return bookDao.findById(id);
    }

    public List<BookType> findAllBookType(){
        return bookTypeDao.findAllBookType();
    }

    public List<Publisher> findAllPublisher(){
        return publisherDao.findAllPublisher();
    }
}
