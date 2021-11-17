package com.se452project.libraryWebApp.service;

import com.se452project.libraryWebApp.model.Book;
import com.se452project.libraryWebApp.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BookService {
    private final BookRepo bookRepo;

    @Autowired
    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public Book addBook(Book book) {
        book.setId(UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE);
        return bookRepo.save(book);
    }

    public List<Book> findAllBooks() {
        return bookRepo.findAll();
    }

    public Book findBookById(Long id)  {
        Book foundBook = null;
        try {
            foundBook = bookRepo.findBookById(id);
        }
        catch(Exception e) {
            foundBook.setAuthor("No Author");
            foundBook.setImageUrl("No Image");
            foundBook.setIsbn("ISBN_Not_Found");
            foundBook.setAuthor("No Author");
            foundBook.setCheckedOut(false);
            return foundBook;
        }
        return foundBook;
    }

    public void deleteBook(Long id) {
        bookRepo.deleteBookById(id);
    }

    public Book updateBook(Book book) {
        book.setCheckedOut(!book.getCheckedOut());
        return book;
    }
}
