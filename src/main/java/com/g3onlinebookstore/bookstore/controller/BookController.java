package com.g3onlinebookstore.bookstore.controller;

import com.g3onlinebookstore.bookstore.model.Book;
import com.g3onlinebookstore.bookstore.repository.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/books")
public class BookController {

    private final BookRepository bookRepo;

    public BookController(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    @GetMapping
    public String listBooks(Model model) {
        model.addAttribute("books", bookRepo.findAll());
        return "books";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("book", new Book());
        return "add-book";
    }

    @PostMapping("/add")
    public String addBook(@ModelAttribute Book book) {
        bookRepo.save(book);
        return "redirect:/books";
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id) {
        bookRepo.deleteById(id);
        return "redirect:/books";
    }
}
