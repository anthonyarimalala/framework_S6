package com.ditrict.controller;

import com.ditrict.repository.PersonalAccessTokensRepository;
import com.ditrict.entity.PersonalAccessTokens;
import org.springframework.http.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "personalAccessTokens")
public class PersonalAccessTokensController {
	@Autowired
	private PersonalAccessTokensRepository repository;

	@PostMapping()
	public ResponseEntity<PersonalAccessTokens> save(@RequestBody PersonalAccessTokens personalAccessTokens){
	 	return ResponseEntity.ok(repository.save(personalAccessTokens));
	}
	@PutMapping()
	public ResponseEntity<PersonalAccessTokens> update(@RequestBody PersonalAccessTokens personalAccessTokens){
	 	return ResponseEntity.ok(repository.save(personalAccessTokens));
	}
	@DeleteMapping()
	public void delete(@RequestBody PersonalAccessTokens personalAccessTokens){
	 	repository.delete(personalAccessTokens);
	}
	@GetMapping()
	public ResponseEntity<Iterable<PersonalAccessTokens>> findAll(){
	 	return ResponseEntity.ok(repository.findAll());
	}


}
