package com.example.springbootapi.service;

import com.example.springbootapi.model.book.Book;
import com.example.springbootapi.model.book.Status;
import com.example.springbootapi.repository.BookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LibraryService {

    @Autowired
    BookDAO bookDAO;

    public ResponseEntity<Status> fetchBookStatusByIsbn(String isbn) {
        Book book = bookDAO.findBookByIsbn10(isbn);
        return new ResponseEntity<>(book.getStatus(), HttpStatus.OK);
    }
}
