package com.se452project.libraryWebApp.book;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksAvailableRepository extends MongoRepository<Book, String> {

}
