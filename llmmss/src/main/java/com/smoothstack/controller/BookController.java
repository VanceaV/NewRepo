package com.smoothstack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smoothstack.entity.Book;
import com.smoothstack.repository.BookRepository;

@RestController
@RequestMapping("/lms")
public class BookController {

	@Autowired
	private BookRepository bookRepository;

	@GetMapping("/books")
	public ResponseEntity<List<Book>> getAllBooks() {
		List<Book> list = bookRepository.getAll();
		return new ResponseEntity<List<Book>>(list, HttpStatus.OK);
	}
	

}
