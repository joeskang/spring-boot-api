package com.example.springbootapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Data
@Entity
public class Author {
    @Id
    private Long id;
    private String lastName;
    private String firstName;
    private Date dateOfBirth;
    @ManyToMany
    private Set<Book> books;
}
