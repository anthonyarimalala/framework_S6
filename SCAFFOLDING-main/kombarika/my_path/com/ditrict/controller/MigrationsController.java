package com.ditrict.controller;

import com.ditrict.repository.MigrationsRepository;
import com.ditrict.entity.Migrations;
import org.springframework.http.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "migrations")
public class MigrationsController {
	@Autowired
	private MigrationsRepository repository;

	@PostMapping()
	public ResponseEntity<Migrations> save(@RequestBody Migrations migrations){
	 	return ResponseEntity.ok(repository.save(migrations));
	}
	@PutMapping()
	public ResponseEntity<Migrations> update(@RequestBody Migrations migrations){
	 	return ResponseEntity.ok(repository.save(migrations));
	}
	@DeleteMapping()
	public void delete(@RequestBody Migrations migrations){
	 	repository.delete(migrations);
	}
	@GetMapping()
	public ResponseEntity<Iterable<Migrations>> findAll(){
	 	return ResponseEntity.ok(repository.findAll());
	}


}
