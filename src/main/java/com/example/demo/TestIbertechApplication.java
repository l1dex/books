package com.example.demo;

import com.example.demo.mapper.BookMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestIbertechApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestIbertechApplication.class, args);
	}

	@Bean
	BookMapper mapper(){
		return new BookMapper();
	}

}
