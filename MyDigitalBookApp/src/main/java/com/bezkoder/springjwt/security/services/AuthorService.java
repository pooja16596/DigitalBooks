package com.bezkoder.springjwt.security.services;

import org.springframework.http.ResponseEntity;

import com.bezkoder.springjwt.payload.request.BookCreaPayload;
import com.bezkoder.springjwt.payload.response.BookRespPayload;

public interface AuthorService {
	
	ResponseEntity<BookRespPayload> createBook(BookCreaPayload bookCreatePayload);
	
	ResponseEntity<BookRespPayload> updateBook(int bookId,BookCreaPayload bookCreatePayload);


}
