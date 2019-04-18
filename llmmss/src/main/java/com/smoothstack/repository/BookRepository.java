package com.smoothstack.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.smoothstack.entity.Book;

@Service
public class BookRepository {

	
	private List<Book> books;
	
	
	public BookRepository() {
		books = new ArrayList<Book>();
		
		Book book = new Book();
		book.setId(1);
		book.setTitle("Book1");
		book.setAuthorId(1);
		book.setPublisherId(2);
		
		books.add(book);
		

		book = new Book();
		book.setId(2);
		book.setTitle("Book2");
		book.setAuthorId(2);
		book.setPublisherId(2);
		
		books.add(book);
		
		
		book = new Book();
		book.setId(3);
		book.setTitle("Book3");
		book.setAuthorId(3);
		book.setPublisherId(3);
		
		books.add(book);
		
		
		book = new Book();
		book.setId(4);
		book.setTitle("Book4");
		book.setAuthorId(4);
		book.setPublisherId(4);
		
		books.add(book);
		
	}
	

	public List<Book> getAll() {
		return books;
	}
	
}
