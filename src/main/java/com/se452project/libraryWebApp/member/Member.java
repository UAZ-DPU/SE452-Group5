package com.se452project.libraryWebApp.member;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@Entity
@Table(name="member")
public class Member {

    @NotNull
    @Id
    private int memberID;

    @NotNull
    private String fName;

    @NotNull
    private String lName;
}
