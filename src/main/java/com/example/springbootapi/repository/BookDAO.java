package com.example.springbootapi.repository;

import com.example.springbootapi.model.book.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDAO extends JpaRepository<Book, String> {
    public Book findBookByIsbn10();
    public List<Book> findBooksByAuthor();
    public List<Book> findBooksByTitle();
}
