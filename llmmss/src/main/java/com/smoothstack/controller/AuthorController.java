package com.smoothstack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.smoothstack.entity.Author;
import com.smoothstack.repository.AuthorRepository;

@RestController
@RequestMapping("/lms")
public class AuthorController {

	@Autowired
	private AuthorRepository authorRepository;

	@GetMapping("/authors")
	public ResponseEntity<List<Author>> getAllAuthors() {
		List<Author> list = authorRepository.getAll();
		return new ResponseEntity<List<Author>>(list, HttpStatus.OK);
	}

}
