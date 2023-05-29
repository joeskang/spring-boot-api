package com.example.springbootapi.model.book;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
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
