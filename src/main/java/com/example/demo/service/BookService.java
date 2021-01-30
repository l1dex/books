package com.example.demo.service;

import com.example.demo.dao.BookRepository;
import com.example.demo.dto.Books;
import com.example.demo.mapper.BookMapper;
import com.example.demo.model.Book;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookMapper bookMapper;

    @Autowired
    private BookRepository bookRepository;

    @PostConstruct
    void readBooks() throws IOException {
        byte[] byteBooks = Files.readAllBytes(Path.of(ResourceUtils.getFile("classpath:books.json").getPath()));
        String jsonBooks = new String(byteBooks);
        Gson gson = new Gson();
        Books books = gson.fromJson(jsonBooks, Books.class);
        List<Book> bookList = new ArrayList<>();
        books.getBooks().stream()
                .forEach(bookDTO -> bookList.add(bookMapper.dtoToBook(bookDTO)));
        bookRepository.saveAll(bookList);
    }
}
