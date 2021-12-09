package com.example.springbootbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springbootbackend.model.Book;
import com.example.springbootbackend.repository.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private BookRepository bookRepository;
	@Override
	public void run(String... args) throws Exception {
 		Book book = new Book();
 		bookRepository.save(new Book(1, "Wings of Fire","A P J Abdul Kalam, Arun Tiwari", 500));
 		bookRepository.save(new Book(2, "The Alchemist","Paulo Coelho", 144));
 		bookRepository.save(new Book(3, "War and Peace","Leo Tolstoy", 299));
 		bookRepository.save(new Book(4, "Song of Solomon","Tony Morrison", 555));
	}
}