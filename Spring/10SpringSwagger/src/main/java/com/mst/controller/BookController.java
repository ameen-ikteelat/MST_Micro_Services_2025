package com.mst.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mst.bean.Book;
import com.mst.controller.api.BookControllerIFC;
import com.mst.service.BookServices;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name ="Book service" , description = "Book management APIs")
@RestController
@RequestMapping("/books")
public class BookController implements BookControllerIFC {

	
	@Autowired
	BookServices bookServices;
	
	

	@PostMapping("/createnewbook")
	public ResponseEntity<Book> createBook(@RequestBody Book book) {
		try {
			Book newBook = bookServices.save(book);
			return new ResponseEntity<>(newBook, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}

		}
	
	
	 
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable("id") int id) {
		Optional<Book> book = bookServices.findByID(id);
		if(!book.isEmpty())
		{
			return new ResponseEntity<>(book.get(), HttpStatus.OK);
		}else
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	

	 
	@PutMapping("/update/{id}")
	 public ResponseEntity<Book> updateBook(@PathVariable("id") int id, @RequestBody Book Book) {
		 Optional<Book> book = bookServices.findByID(id);
		 if(book.isPresent())
		 {
			 book.get().setDescription("Hello Troy!!");
			 return new ResponseEntity<>( bookServices.save(book.get()),HttpStatus.OK);
			 
		 }else
		 {
			 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		 }
	 }
	
	
	@DeleteMapping("/delete/{id}")
	 public ResponseEntity<HttpStatus> deleteBook(@PathVariable("id") int id) {
		try {
		      bookServices.deleteBook(id);
		      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		    } catch (Exception e) {
		      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		    }
	 }
	
	
	
}
