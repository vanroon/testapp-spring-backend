package com.example.springbootbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootbackend.model.Book;
import com.example.springbootbackend.repository.BookRepository;

@CrossOrigin(origins = "http://localhost:3001/")
@RestController
public class BookController {

 @Autowired
 private BookRepository bookRepository;
 @GetMapping("/books")
 public List<Book> getAllBooks() {
  return bookRepository.findAll();
 }
}