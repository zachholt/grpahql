package com.zachholt.graphql.demo.models;

import java.util.UUID;

public class Author {
    private UUID id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String userName;

    public UUID getId() {
        return id;
    }

    public Author setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Author setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Author setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public Author setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public Author setUserName(String userName) {
        this.userName = userName;
        return this;
    }
}
