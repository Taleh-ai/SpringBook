package com.example.springbook.controller;

import com.example.springbook.dto.BookDTO;
import com.example.springbook.entity.BookEntity;
import com.example.springbook.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @PostMapping("/add")
    public BookEntity add(@RequestBody BookEntity dto){
        return bookService.create(dto);
    }
    @GetMapping("/all")
    public List<BookEntity> getAll(){
        return bookService.getAll();
    }
    @GetMapping("/{id}")
    public BookEntity getBook(@PathVariable("id") Long id){
        return bookService.findBookById(id);
    }
    @DeleteMapping("delete/{id}" )
    public void deleteById(@PathVariable("id") Long id ) throws Exception {
        bookService.deeleteBookId(id);
    }

}
