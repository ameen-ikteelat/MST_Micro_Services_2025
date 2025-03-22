package com.mst.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mst.bean.Book;
import com.mst.repository.BookRepository;



@Service
public class BookServices {

	@Autowired
	BookRepository bookRepo ;
	
	
	public Optional<Book> findByID(int id )
	{
		return bookRepo.findById(id);
	}
	
	public Book save ( Book book)
	{
		return bookRepo.save(book);
	}
	
	public void deleteBook( int id)
	{
		bookRepo.deleteById(id);
	}
	
	public Book updateBook(Book book)
	{
		return bookRepo.save(book);
	}
	
	public void deleteAll()
	{
		bookRepo.deleteAll();
	}
}
