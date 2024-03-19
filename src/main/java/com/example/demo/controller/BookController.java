/**
 * @author  Ruvini Ramawickrama
 */
package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    BookService bookService;

    @QueryMapping
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    @QueryMapping
    public Book getBook(@Argument Long id) {
        return bookService.getBook(id);
    }

    @MutationMapping
    public Book createBook(@Argument Book book) {
        return bookService.createBook(book);
    }

    @MutationMapping
    public Book updateBook(@Argument Book book) {
        return bookService.updateBook(book);
    }

    @MutationMapping
    public Boolean deleteBook(@Argument Long id) {
        return bookService.deleteBook(id);
    }

}
