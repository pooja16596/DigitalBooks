package com.bezkoder.springjwt.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bezkoder.springjwt.payload.request.BookCreaPayload;
import com.bezkoder.springjwt.payload.response.BookRespPayload;
import com.bezkoder.springjwt.payload.response.BookUpdateResponse;
import com.bezkoder.springjwt.security.services.AuthorService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/digitalbooks/")
public class AuthorController {

	
	private AuthorService authorService;
	
	RestTemplate restTemplate=new RestTemplate();
	@PostMapping("/author/books")
	@PreAuthorize("hasRole('AUTHOR')")
	public ResponseEntity<BookRespPayload> createBook(@RequestBody BookCreaPayload bookCreatePayload){
		
		ResponseEntity<BookRespPayload> book=authorService.createBook(bookCreatePayload);
			
		if(book.getStatusCode()==HttpStatus.CREATED) {
		
			return new ResponseEntity<>(book.getBody(),HttpStatus.CREATED);
		}
		
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@PutMapping("/author/books/{book-id}")
	@PreAuthorize("hasRole('AUTHOR')")
	public ResponseEntity<?> updateBook(@PathVariable("book-id") int bookId,@RequestBody BookCreaPayload bookpayload){
		
		ResponseEntity<BookRespPayload> response=authorService.updateBook(bookId, bookpayload);
		if(response.getStatusCode()==HttpStatus.OK) {
			
			return new ResponseEntity<>(response.getBody(),HttpStatus.OK);
		}
		
		return new ResponseEntity<>(new BookUpdateResponse("Book Update Fail !"),HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
}
