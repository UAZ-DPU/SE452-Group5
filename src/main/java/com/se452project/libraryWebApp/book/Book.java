package com.se452project.libraryWebApp.book;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.se452project.libraryWebApp.itemObject.Item;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "book")
public class Book{

    @NotNull
    @Size(min = 2, max = 25)
    @Id
    private String bookID;

    @NotNull
    @Size(min = 13, max = 13)
    private String bookISBN;

    @NotNull
    @Size(min = 1)
    private String title;

}
