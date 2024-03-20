package com.ditrict.controller;

import com.ditrict.repository.PasswordResetsRepository;
import com.ditrict.entity.PasswordResets;
import org.springframework.http.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "passwordResets")
public class PasswordResetsController {
	@Autowired
	private PasswordResetsRepository repository;

	@PostMapping()
	public ResponseEntity<PasswordResets> save(@RequestBody PasswordResets passwordResets){
	 	return ResponseEntity.ok(repository.save(passwordResets));
	}
	@PutMapping()
	public ResponseEntity<PasswordResets> update(@RequestBody PasswordResets passwordResets){
	 	return ResponseEntity.ok(repository.save(passwordResets));
	}
	@DeleteMapping()
	public void delete(@RequestBody PasswordResets passwordResets){
	 	repository.delete(passwordResets);
	}
	@GetMapping()
	public ResponseEntity<Iterable<PasswordResets>> findAll(){
	 	return ResponseEntity.ok(repository.findAll());
	}


}
