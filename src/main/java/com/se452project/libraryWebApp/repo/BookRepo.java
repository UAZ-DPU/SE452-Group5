package com.se452project.libraryWebApp.repo;

import com.se452project.libraryWebApp.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, String> {
    void deleteBookById(Long id);
    Book findBookById(Long id);
}
