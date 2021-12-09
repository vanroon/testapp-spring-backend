package com.example.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootbackend.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{ 
}