package com.se452project.libraryWebApp.book;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document("BooksAvailable")
public class BooksAvailableDocument {

    @Id
    private String bookId;

    private int numberAvailable;

}
