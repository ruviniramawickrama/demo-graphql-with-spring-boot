/**
 * @author  Ruvini Ramawickrama
 */
package com.example.demo.service;

import com.example.demo.model.Book;

import java.util.List;

public interface BookService {

    public List<Book> getBooks();

    public Book getBook(Long id);

    public Book createBook(Book book);

    public Book updateBook(Book book);

    public Boolean deleteBook(Long id);

}
