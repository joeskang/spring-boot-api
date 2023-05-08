package com.example.springbootapi.service;

import com.example.springbootapi.model.Book;
import com.example.springbootapi.model.Status;
import com.example.springbootapi.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class LibraryServiceImpl implements LibraryService{
    @Autowired
    BookRepository bookRepository;
    @Override
    public Status getBookStatus(String isbn){
        Book book = bookRepository.findBookByIsbn(isbn);
        return book.getStatus();
    }
}
