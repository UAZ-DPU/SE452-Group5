package com.se452project.libraryWebApp.magazine;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.se452project.libraryWebApp.itemObject.Item;
import lombok.Data;
import javax.persistence.Id;

@Data
@Entity
@Table(name="Magazine")
public class Magazine implements Item {

    @NotNull
    @Size(min = 2, max = 25)
    @Id
    private String magazineID;

    @NotNull
    @Size(min = 8, max = 8)
    private String magazineISSN;

    @NotNull
    @Size(min = 1)
    private String title;

    @Override
    public String returnItemId() {
        return magazineID;
    }

    @Override
    public String returnItemType() {
        return "Magazine";
    }
}