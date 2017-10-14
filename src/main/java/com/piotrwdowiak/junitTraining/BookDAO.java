package com.piotrwdowiak.junitTraining;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class BookDAO {

    /**
     * @return All books
     * @throws NoSuchBookException
     */
    public List<Book> getBooks() throws NoSuchBookException {
        throw new NotImplementedException();
    }

    /**
     * @param id
     * @return Book with given ID;
     * @throws NoSuchBookException
     */
    public Book getBookById(String id) throws NoSuchBookException {
        throw new NotImplementedException();
    }

    /**
     * @param book
     * @return Returns true if Book edited successfuly
     */
    public boolean editBook(Book book) {
        throw new NotImplementedException();
    }

    /**
     * @param book
     * @return Returns true if Book deleted successfuly
     */
    public boolean deleteBook(Book book) {
        throw new NotImplementedException();
    }

    /**
     * @param book
     * @return Returns false if Book deleted successfuly
     */
    public boolean addBook(Book book) {
        throw new NotImplementedException();
    }
}