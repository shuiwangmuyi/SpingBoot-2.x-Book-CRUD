package com.szh.springboot.domain;

/**
 *
 */
public class Book {

    private Integer bookId;
    private String bookName;
    private Integer bookCount;
    private String bookDetail;

    public Book() {
    }

    public Book(Integer bookId, String bookName, Integer bookCount, String bookDetail) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookCount = bookCount;
        this.bookDetail = bookDetail;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getBookCount() {
        return bookCount;
    }

    public void setBookCount(Integer bookCount) {
        this.bookCount = bookCount;
    }

    public String getBookDetail() {
        return bookDetail;
    }

    public void setBookDetail(String bookDetail) {
        this.bookDetail = bookDetail;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookCount=" + bookCount +
                ", bookDetail='" + bookDetail + '\'' +
                '}';
    }
}
