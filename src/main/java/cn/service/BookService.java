package cn.service;

import cn.domain.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {

    void addBook(Book books);

    void deleteBookByID(@Param("bookID")int id);

    void updateBook(Book books);

    Book queryBookByID(@Param("bookID")int id);

    List<Book> queryAllBook();
}
