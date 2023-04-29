package com.example.springbootapi.controller;

import com.example.springbootapi.model.book.Book;
import com.example.springbootapi.model.book.Status;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

public class LibraryController {

    @GetMapping("/book/status")
    public void getBookStatus(){
        // TODO: return type Status
    }
}
