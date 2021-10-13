package com.se452project.libraryWebApp.book;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
public class Book {

    @NotNull
    @Size(min = 2, max = 25)
    private String bookID;

    @NotNull
    @Size(min = 13, max = 13)
    private String bookISBN;

    @NotNull
    @Size(min = 1)
    private String title;
}
