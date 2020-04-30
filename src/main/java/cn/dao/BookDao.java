package cn.dao;

import cn.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface BookDao {

    @Insert("insert into books(bookID , bookName, bookCounts, detail) values (#{bookID},#{bookName},#{bookCounts},#{detail})")
    void addBook(Book books);

    @Delete("delete from books where bookID = #{bookID}")
    void deleteBookByID(@Param("bookID")int id);

    @Update("update books set bookName = #{bookName} , bookCounts = #{bookCounts} ,detail = #{detail} where bookID = #{bookID}")
    void updateBook(Book books);

    @Select("select * from books where bookID = #{bookID}")
    Book queryBookByID(@Param("bookID")int id);

    @Select("select * from books")
    List<Book> queryAllBook();
}
