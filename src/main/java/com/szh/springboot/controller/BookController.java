package com.szh.springboot.controller;

import com.szh.springboot.domain.Book;
import com.szh.springboot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@Controller
@RequestMapping(value = "/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/queryBookByName")
    public String queryBookByName(String bookName,Model model) {
        Book book=bookService.queryBookByName(bookName);
        List<Book> bookList=new ArrayList<>();
        bookList.add(book);
        model.addAttribute("bookList",bookList);
        return "home";
    }

    @RequestMapping(value = "/home")
    public String queryAllBook(Model model, HttpSession session) {
        if(session.getAttribute("msg")!=null) {
            List<Book> bookList=bookService.queryAllBook();
            model.addAttribute("bookList",bookList);
            return "home";
        }else {
            return "error";
        }
    }

    @RequestMapping(value = "/toAddBook")
    public String toAddBook() {
        return "addBook";
    }

    @RequestMapping(value = "/addBook")
    public String addBook(Book book) {
        int rows=bookService.addBook(book);
        if(rows>0) {
            return "redirect:/book/home";
        }else {
            return "home";
        }
    }

    @RequestMapping(value = "/toUpdateBook/{id}")
    public String toUpdateBook(@PathVariable("id") Integer id,Model model) {
        Book book=bookService.queryBookById(id);
        model.addAttribute("book",book);
        return "updateBook";
    }

    @RequestMapping(value = "/updateBook")
    public String updateBook(Book book) {
        int rows=bookService.updateBook(book);
        if(rows>0) {
            return "redirect:/book/home";
        }else {
            return "error";
        }
    }

    @RequestMapping(value = "/deleteBook/{id}")
    public String deleteBook(@PathVariable("id") Integer id) {
        int rows=bookService.deleteBook(id);
        if(rows>0) {
            return "redirect:/book/home";
        }else {
            return "error";
        }
    }
}
