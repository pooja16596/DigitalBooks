package com.bezkoder.springjwt.controllers;

import java.util.HashSet;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bezkoder.springjwt.models.ERole;
import com.bezkoder.springjwt.models.Role;
import com.bezkoder.springjwt.models.User;
import com.bezkoder.springjwt.payload.request.SignupRequest;
import com.bezkoder.springjwt.payload.response.MessageResponse;

public class DigitalbookController {

	/*
	 * @PostMapping("/signup") public ResponseEntity<?>
	 * registerUser(@Valid @RequestBody SignupRequest signUpRequest) { if
	 * (userRepository.existsByUsername(signUpRequest.getUsername())) { return
	 * ResponseEntity .badRequest() .body(new
	 * MessageResponse("Error: Username is already taken!")); }
	 * 
	 * if (userRepository.existsByEmail(signUpRequest.getEmail())) { return
	 * ResponseEntity .badRequest() .body(new
	 * MessageResponse("Error: Email is already in use!")); }
	 * 
	 * // Create new user's account User user = new
	 * User(signUpRequest.getUsername(), signUpRequest.getEmail(),
	 * encoder.encode(signUpRequest.getPassword()));
	 * 
	 * Set<String> strRoles = signUpRequest.getRole(); Set<Role> roles = new
	 * HashSet<>();
	 * 
	 * if (strRoles == null) { Role userRole =
	 * roleRepository.findByName(ERole.GUEST_USER) .orElseThrow(() -> new
	 * RuntimeException("Error: GUEST_USER is not found.")); roles.add(userRole); }
	 * else { strRoles.forEach(role -> { switch (role) { case "admin": Role
	 * adminRole = roleRepository.findByName(ERole.READER) .orElseThrow(() -> new
	 * RuntimeException("Error: Reader is not found.")); roles.add(adminRole);
	 * 
	 * break; case "mod": Role modRole = roleRepository.findByName(ERole.AUTHOR)
	 * .orElseThrow(() -> new RuntimeException("Error: Author is not found."));
	 * roles.add(modRole);
	 * 
	 * break; default: Role userRole = roleRepository.findByName(ERole.GUEST_USER)
	 * .orElseThrow(() -> new RuntimeException("Error: GUEST_USER is not found."));
	 * roles.add(userRole); } }); }
	 * 
	 * user.setRoles(roles); userRepository.save(user);
	 * 
	 * return ResponseEntity.ok(new
	 * MessageResponse("User registered successfully!")); }
	 */
}
