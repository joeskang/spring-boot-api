package com.example.springbootapi.model.book;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NonNull;
import lombok.ToString;

@Entity
public class Book {
    @Id
    private String isbn10;
    @NonNull
    private String title;
    @ManyToOne
    private Author author;
    @NonNull
    private Status status;
    @Enumerated(EnumType.STRING)
    private Genre genre;
    private String deweyDecimal;
}
