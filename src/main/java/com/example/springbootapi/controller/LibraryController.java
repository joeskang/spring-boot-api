package com.example.springbootapi.controller;

import com.example.springbootapi.model.book.Book;
import com.example.springbootapi.model.book.Status;
import com.example.springbootapi.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.client.RestTemplate;

public class LibraryController {
    @Autowired
    LibraryService libraryService;

    @GetMapping("/book/status")
    public ResponseEntity<Status> getBookStatus(@RequestHeader(value = "ISBN-10", required = true) String isbn10 ){
    }
}
