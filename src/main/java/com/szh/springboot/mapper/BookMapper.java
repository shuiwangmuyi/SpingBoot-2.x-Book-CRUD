package com.szh.springboot.mapper;

import com.szh.springboot.domain.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 */
public interface BookMapper {

    /**
     * 根据id查询图书信息
     * @param bookId
     * @return
     */
    Book selectBookById(@Param("bookId") Integer bookId);

    /**
     * 根据书名查询图书信息
     * @param bookName
     * @return
     */
    Book selectBookByName(@Param("bookName") String bookName);

    /**
     * 查询所有图书信息
     * @return
     */
    List<Book> selectAllBook();

    /**
     * 新增图书
     * @param book
     * @return
     */
    int insertBook(Book book);

    /**
     * 更新图书
     * @param book
     * @return
     */
    int updateBook(Book book);

    /**
     * 根据id删除图书
     * @param bookId
     * @return
     */
    int deleteBook(@Param("bookId") Integer bookId);
}
