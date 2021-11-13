package com.se452project.libraryWebApp.book;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import java.util.List;

public class bookdata {

    private static final Logger log = LoggerFactory.getLogger(bookdata.class);

    @Bean
    public CommandLineRunner saveBook(BooksAvailableRepository repository) {
        return (args) -> {
            Book book1 = new Book();
            book1.setBookID("test");
            book1.setBookISBN("1234567891234");
            book1.setTitle("testtitle");
            repository.save(book1);
        };
    }

    @Bean
    public CommandLineRunner showBooks(BooksAvailableRepository repository) {
        return (args) -> {
            List<Book> books = repository.findAll();
            for (Book book : books) {
                log.info(books.toString());
            }
        };
    }
}