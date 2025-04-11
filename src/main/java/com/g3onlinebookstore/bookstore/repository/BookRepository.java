package com.g3onlinebookstore.bookstore.repository;

import com.g3onlinebookstore.bookstore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
