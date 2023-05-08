package com.example.springbootapi.repository;

import com.example.springbootapi.model.Book;
import com.example.springbootapi.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {
    public Book findBookByIsbn(String isbn);
}
