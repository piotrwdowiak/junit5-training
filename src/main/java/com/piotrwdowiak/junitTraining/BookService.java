package com.piotrwdowiak.junitTraining;

import java.util.List;

public class BookService {

    private BookDAO bookDAO;

    public BookService(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    public boolean editBook(Book book) {
        return bookDAO.editBook(book);
    }

    public boolean deleteBook(Book book) {
        return bookDAO.deleteBook(book);
    }

    public boolean addBook(Book book) {
        return bookDAO.addBook(book);
    }

    public List<Book> getBooks() {
        return bookDAO.getBooks();
    }

    public Book getBookById(String id) {
        return bookDAO.getBookById(id);
    }
}