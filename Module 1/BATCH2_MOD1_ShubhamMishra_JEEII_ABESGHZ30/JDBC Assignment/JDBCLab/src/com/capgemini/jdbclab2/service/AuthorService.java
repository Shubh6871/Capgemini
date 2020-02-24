package com.capgemini.jdbclab2.service;

import com.capgemini.jdbclab2.entities.Author;

public interface AuthorService {
	public String insertAuthor(Author a);
	public String updateAuthor(String a,double price);
	public String deleteAuthor(Long authorId);
	public Author findAuthor(Long authorId);
}
