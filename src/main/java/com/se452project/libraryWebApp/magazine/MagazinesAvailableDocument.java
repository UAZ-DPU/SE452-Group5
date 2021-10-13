package com.se452project.libraryWebApp.magazine;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document("MagazinesAvailableDocument")
public class MagazinesAvailableDocument {

    @Id
    String magazineISSN;
    String title;
    String publisher;
    boolean available;
}
