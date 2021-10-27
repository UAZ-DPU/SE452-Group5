package com.se452project.libraryWebApp.member;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import lombok.Data;

public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int memberID;

    @Column(nullable = false)
    private String fName;

    @Column(nullable = false)
    private String lName;

    @Column(nullable = false,unique = true, length=45)
    private String email;

    @Column(nullable = false)
    private String password;
}
