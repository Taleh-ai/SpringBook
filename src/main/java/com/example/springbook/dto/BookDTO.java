package com.example.springbook.dto;

import lombok.Data;

@Data
public class BookDTO {
    Long id;
    String name;
    String author;
    int publish_year;
    int page_count;
}
