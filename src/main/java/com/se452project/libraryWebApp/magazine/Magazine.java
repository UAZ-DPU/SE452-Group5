package com.se452project.libraryWebApp.magazine;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
public class Magazine {

    @NotNull
    @Size(min = 2, max = 25)
    private String magazineID;

    @NotNull
    @Size(min = 13, max = 13)
    private String magazineISSN;

    @NotNull
    @Size(min = 1)
    private String title;
}