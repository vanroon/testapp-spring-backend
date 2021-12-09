package com.example.springbootbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.EnableAspectJAutoProxy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String bookName;
    private String authorName;
    private long price;

    public Book(){

    }
    public Book(long id, String bookName, String authorName, long price){
        this.id = id;
        this.bookName = bookName;
        this.authorName = authorName;
        this.price = price;
    }


    public long getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }
    
    public String getAuthorName() {
        return authorName;
    }

    public long getPrice() {
        return price;
    }
}