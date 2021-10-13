package com.se452project.libraryWebApp.book;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import javax.persistence.Id;

@Data
@Entity
@Table(name="Book")
public class Book {

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
