package com.movie.db.KotakKantorMovieDB.models;

import org.springframework.data.annotation.Id;

public class Customer {
    @Id
    public String id;

    public String firstName;
    public String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}