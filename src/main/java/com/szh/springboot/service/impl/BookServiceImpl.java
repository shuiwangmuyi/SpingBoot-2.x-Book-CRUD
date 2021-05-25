package com.szh.springboot.service.impl;

import com.szh.springboot.domain.Book;
import com.szh.springboot.mapper.BookMapper;
import com.szh.springboot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public Book queryBookById(Integer bookId) {
        return bookMapper.selectBookById(bookId);
    }

    @Override
    public Book queryBookByName(String bookName) {
        return bookMapper.selectBookByName(bookName);
    }

    @Override
    public List<Book> queryAllBook() {
        return bookMapper.selectAllBook();
    }

    @Override
    public int addBook(Book book) {
        return bookMapper.insertBook(book);
    }

    @Override
    public int updateBook(Book book) {
        return bookMapper.updateBook(book);
    }

    @Override
    public int deleteBook(Integer bookId) {
        return bookMapper.deleteBook(bookId);
    }
}
