package com.example.springbootapi.model.book;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NonNull;

import java.util.Date;

@Entity
public class Author {
    @Id
    private Integer id;
    @NonNull
    private String lastName;
    private String firstName;
    private Date dateOfBirth;
}
