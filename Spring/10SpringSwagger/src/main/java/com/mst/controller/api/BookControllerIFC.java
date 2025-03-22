package com.mst.controller.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.mst.bean.Book;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

public interface BookControllerIFC {

	
	@Operation(summary = " create new Book Entity ", tags = {"Books" , "POST"})
	@ApiResponses({
		@ApiResponse(responseCode = "200" , content = {@Content (schema = @Schema(implementation = Book.class), mediaType = "application/json")}),
		@ApiResponse(responseCode = "500" , content = { @Content(schema = @Schema()) }) })

	public ResponseEntity<Book> createBook(@RequestBody Book book) ;
	
	@Operation(summary = "Retrieve all Books", tags = { "Books", "get", "filter" })
	  @ApiResponses({
	      @ApiResponse(responseCode = "200", content = {
	          @Content(schema = @Schema(implementation = Book.class), mediaType = "application/json") }),
	      @ApiResponse(responseCode = "204", description = "There are no Books", content = {
	          @Content(schema = @Schema()) }),
	      @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
	public ResponseEntity<Book> getBookById(@PathVariable("id") int id);
	
}
