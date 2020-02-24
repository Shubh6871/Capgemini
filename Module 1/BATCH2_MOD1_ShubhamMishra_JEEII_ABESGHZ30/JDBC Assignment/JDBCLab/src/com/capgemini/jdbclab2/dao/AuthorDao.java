package com.capgemini.jdbclab2.dao;

import com.capgemini.jdbclab2.entities.Author;

public interface AuthorDao {
	public String insertAuthor(Author a);
	public String updateAuthor(String a,double price);
	public String deleteAuthor(Long authorId);
	public Author findAuthor(Long authorId);

}
