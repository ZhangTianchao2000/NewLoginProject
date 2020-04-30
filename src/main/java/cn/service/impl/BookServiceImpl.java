package cn.service.impl;

import cn.dao.BookDao;
import cn.domain.Book;
import cn.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    @Qualifier("bookDao")
    private BookDao bookDao;

    @Override
    public void addBook(Book books) {
        bookDao.addBook(books);
    }

    @Override
    public void deleteBookByID(int id) {
        bookDao.deleteBookByID(id);
    }

    @Override
    public void updateBook(Book books) {
        bookDao.updateBook(books);
    }

    @Override
    public Book queryBookByID(int id) {
        return bookDao.queryBookByID(id);
    }

    @Override
    public List<Book> queryAllBook() {
        return bookDao.queryAllBook();
    }
}
