package com.example.demo.dao;

import com.example.demo.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
    default boolean isHome(){
        return true;
    }
    default boolean isNotHome(){
        return false;
    }
}
