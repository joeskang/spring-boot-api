package com.example.springbootapi.service;

import com.example.springbootapi.model.book.Status;
import com.example.springbootapi.repository.BookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class LibraryService {

    @Autowired
    BookDAO bookDAO;

    public Status fetchBookStatus(String title) {
        return null;
    }
}
