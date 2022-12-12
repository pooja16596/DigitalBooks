package com.bezkoder.springjwt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.springjwt.models.Book;
import com.bezkoder.springjwt.repository.BookRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/allbooks/")
public class BookController {

	@Autowired
	private BookRepository bookRepository;
	
	//get all books
	@GetMapping("/books")
	public List<Book> getAllBooks()
	{
		return bookRepository.findAll();
		
	}
	
	/*
	 * @RequestMapping("/hello") public String hello() { return "Hello, world"; }
	 */
}
