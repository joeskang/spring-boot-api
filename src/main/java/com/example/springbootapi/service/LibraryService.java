package com.example.springbootapi.service;

import com.example.springbootapi.model.Status;
import org.springframework.stereotype.Service;

@Service
public interface LibraryService {
    public Status getBookStatus(String isbn);
}
