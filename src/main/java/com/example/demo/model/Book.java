package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    private Long isbn;

    @Column
    private String title;

    @Column(length = 1024)
    private String subtitle;

    @Column
    private String author;

    @Column
    private String published;

    @Column
    private String publisher;

    @Column
    private int pages;

    @Column(length = 1024)
    private String description;

    @Column(length = 1024)
    private String website;
}
