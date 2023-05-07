package com.example.springbook.service;

import com.example.springbook.entity.BookEntity;
import com.example.springbook.repository.BookRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
private final BookRepo bookRepo;


    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public List<BookEntity> getAll(){
     return   bookRepo.findAll();

    }

    public BookEntity create(BookEntity book){
    return bookRepo.save(book);
    }

    public BookEntity findBookById(Long id) {
        Optional<BookEntity> optionalBook = bookRepo.findById(id);
        return optionalBook.orElse(null);
    }

}
