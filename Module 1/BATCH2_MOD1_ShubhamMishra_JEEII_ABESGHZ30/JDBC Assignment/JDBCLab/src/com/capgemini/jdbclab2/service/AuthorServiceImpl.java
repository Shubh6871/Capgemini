package com.capgemini.jdbclab2.service;

import com.capgemini.jdbclab2.dao.AuthorDao;
import com.capgemini.jdbclab2.dao.AuthorDaoImpl;
import com.capgemini.jdbclab2.entities.Author;

public class AuthorServiceImpl implements AuthorService{
	AuthorDao dao=new AuthorDaoImpl();
	@Override
	public String insertAuthor(Author a) {
		return dao.insertAuthor(a);
		
	}
	
	@Override
	public String updateAuthor(String a, double price) {
		return dao.updateAuthor(a, price);
		
	}

	@Override
	public String deleteAuthor(Long authorId) {
		return dao.deleteAuthor(authorId);
	}

	@Override
	public Author findAuthor(Long authorId) {
		return dao.findAuthor(authorId);
	}

}
