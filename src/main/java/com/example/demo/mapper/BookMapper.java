package com.example.demo.mapper;

import com.example.demo.dto.BookDTO;
import com.example.demo.model.Book;

public class BookMapper {
    public Book dtoToBook(BookDTO bookDTO){
        return new Book(
                bookDTO.getIsbn(),
                bookDTO.getTitle(),
                bookDTO.getSubtitle(),
                bookDTO.getAuthor(),
                bookDTO.getPublished(),
                bookDTO.getPublisher(),
                bookDTO.getPages(),
                bookDTO.getDescription(),
                bookDTO.getWebsite()
        );

    }
}
