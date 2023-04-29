package com.example.springbootapi.model.book;

import lombok.Data;
import lombok.NonNull;

import java.util.Date;

@Data
public class Author {
    @NonNull
    private String lastName;
    private String firstName;
    private Date dateOfBirth;
}
