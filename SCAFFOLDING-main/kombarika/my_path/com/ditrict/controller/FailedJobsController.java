package com.ditrict.controller;

import com.ditrict.repository.FailedJobsRepository;
import com.ditrict.entity.FailedJobs;
import org.springframework.http.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "failedJobs")
public class FailedJobsController {
	@Autowired
	private FailedJobsRepository repository;

	@PostMapping()
	public ResponseEntity<FailedJobs> save(@RequestBody FailedJobs failedJobs){
	 	return ResponseEntity.ok(repository.save(failedJobs));
	}
	@PutMapping()
	public ResponseEntity<FailedJobs> update(@RequestBody FailedJobs failedJobs){
	 	return ResponseEntity.ok(repository.save(failedJobs));
	}
	@DeleteMapping()
	public void delete(@RequestBody FailedJobs failedJobs){
	 	repository.delete(failedJobs);
	}
	@GetMapping()
	public ResponseEntity<Iterable<FailedJobs>> findAll(){
	 	return ResponseEntity.ok(repository.findAll());
	}


}
