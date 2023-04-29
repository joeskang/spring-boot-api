package com.example.springbootapi.model.book;

import lombok.Data;
import lombok.NonNull;
import lombok.ToString;

@Data
public class Book {
    @NonNull
    private String title;
    @NonNull
    private Author author;
    @NonNull
    private Status status;
    private Genre genre;
    private String deweyDecimal;
}
