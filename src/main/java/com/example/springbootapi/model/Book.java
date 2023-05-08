package com.example.springbootapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.Set;

@Data
@Entity
public class Book {
    @Id
    private String isbn;
    private String title;
    // it's possible to have multiple authors per book and vice versa
    @ManyToMany
    private Set<Author> authors;
    private Status status;
    private Genre genre;
    private String deweyDecimal;

}
