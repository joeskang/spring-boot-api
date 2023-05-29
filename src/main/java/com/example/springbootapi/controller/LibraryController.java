package com.example.springbootapi.controller;

import com.example.springbootapi.model.book.Status;
import com.example.springbootapi.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LibraryController {

    @Autowired
    LibraryService libraryService;

    @GetMapping("/book/status")
    public ResponseEntity<Status> getBookStatus(@RequestParam(name="isbn") String isbn){
        return libraryService.fetchBookStatusByIsbn(isbn);
    }
}
