package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {
    private Long isbn;

    private String title;

    private String subtitle;

    private String author;

    private String published;

    private String publisher;

    private int pages;

    private String description;

    private String website;

    private boolean isHome;
}
