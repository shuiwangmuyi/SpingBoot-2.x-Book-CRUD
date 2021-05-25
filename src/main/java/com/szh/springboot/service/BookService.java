package com.szh.springboot.service;

import com.szh.springboot.domain.Book;

import java.util.List;

/**
 *
 */
public interface BookService {

    Book queryBookById(Integer bookId);

    Book queryBookByName(String bookName);

    List<Book> queryAllBook();

    int addBook(Book book);

    int updateBook(Book book);

    int deleteBook(Integer bookId);
}
