package com.bezkoder.springjwt.security.services;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.client.RestTemplate;

import com.bezkoder.springjwt.models.User;
import com.bezkoder.springjwt.payload.request.BookCreaPayload;
import com.bezkoder.springjwt.payload.response.BookRespPayload;
import com.bezkoder.springjwt.repository.UserRepository;


public class AuthorServiceImpl implements AuthorService{
	
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private UserRepository userRepository;


	@Override
	public ResponseEntity<BookRespPayload> createBook(BookCreaPayload bookCreatePayload) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username = "";
		if (principal instanceof UserDetails) {
			username = ((UserDetails) principal).getUsername();
		} else {
			username = principal.toString();
		}
		Optional<User> userlogedin = userRepository.findByUsername(username);
		long id = 0;
		
		if (userlogedin.isPresent()) {
			String user = userlogedin.get().getUsername();
			id = userlogedin.get().getId();
			

		}
		String url = "http://localhost:8080/digitalbooks/author/" + id + "/books";
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<BookCreaPayload> entity = new HttpEntity<BookCreaPayload>(bookCreatePayload, headers);



		//log.info("Book Creation successfull");
		return restTemplate.exchange(url, HttpMethod.POST, entity,
				BookRespPayload.class);
	}

	@Override
	public ResponseEntity<BookRespPayload> updateBook(int bookId, BookCreaPayload bookCreatePayload) {
		
		return null;
	}

}
