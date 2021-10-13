package com.se452project.libraryWebApp.magazine;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MagazinesAvailableRepository extends MongoRepository<MagazinesAvailableDocument, String> {
    int findByISSN(String bookISBN);
    String findByPublisher(String bookTitle);
    String findByAuthor(String authorName);
}
