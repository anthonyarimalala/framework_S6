package com.ditrict.controller;

import com.ditrict.repository.EtudiantsRepository;
import com.ditrict.entity.Etudiants;
import org.springframework.http.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "etudiants")
public class EtudiantsController {
	@Autowired
	private EtudiantsRepository repository;

	@PostMapping()
	public ResponseEntity<Etudiants> save(@RequestBody Etudiants etudiants){
	 	return ResponseEntity.ok(repository.save(etudiants));
	}
	@PutMapping()
	public ResponseEntity<Etudiants> update(@RequestBody Etudiants etudiants){
	 	return ResponseEntity.ok(repository.save(etudiants));
	}
	@DeleteMapping()
	public void delete(@RequestBody Etudiants etudiants){
	 	repository.delete(etudiants);
	}
	@GetMapping()
	public ResponseEntity<Iterable<Etudiants>> findAll(){
	 	return ResponseEntity.ok(repository.findAll());
	}


}
