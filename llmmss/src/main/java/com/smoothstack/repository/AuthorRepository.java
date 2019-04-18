package com.smoothstack.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.smoothstack.entity.Author;

@Service
public class AuthorRepository {
	
	
	private List<Author> authors;
	
	
	public AuthorRepository() {
		authors = new ArrayList<Author>();
		
		Author author = new Author();
		author.setId(1);
		author.setAuthorName("Alex");
		authors.add(author);
		
		author = new Author();
		author.setId(2);
		author.setAuthorName("Vlad");
		authors.add(author);
		
		author = new Author();
		author.setId(3);
		author.setAuthorName("Vadim");
		authors.add(author);
		
		
		author = new Author();
		author.setId(4);
		author.setAuthorName("Igor");
		authors.add(author);
		
	}


	public List<Author> getAll() {
		return authors;
	}

}
