package com.ditrict.controller;

import com.ditrict.repository.UsersRepository;
import com.ditrict.entity.Users;
import org.springframework.http.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "users")
public class UsersController {
	@Autowired
	private UsersRepository repository;

	@PostMapping()
	public ResponseEntity<Users> save(@RequestBody Users users){
	 	return ResponseEntity.ok(repository.save(users));
	}
	@PutMapping()
	public ResponseEntity<Users> update(@RequestBody Users users){
	 	return ResponseEntity.ok(repository.save(users));
	}
	@DeleteMapping()
	public void delete(@RequestBody Users users){
	 	repository.delete(users);
	}
	@GetMapping()
	public ResponseEntity<Iterable<Users>> findAll(){
	 	return ResponseEntity.ok(repository.findAll());
	}


}
