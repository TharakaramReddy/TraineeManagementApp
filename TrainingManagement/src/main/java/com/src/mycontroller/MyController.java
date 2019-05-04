package com.src.mycontroller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.src.bean.TraineeDetails;
import com.src.service.TraineeServiceImpl;

@RestController
public class MyController {
	
	@Autowired
	TraineeServiceImpl service;
	@GetMapping("/")
	public String sayHi() {
		return "Hello";
	}
	@PostMapping("/register")
	public ResponseEntity register(@RequestBody TraineeDetails traineeDetails) {
		service.register(traineeDetails);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	
	@GetMapping("/login")
	public void login(@RequestBody TraineeDetails traineeDetails) {
		int id=service.login(traineeDetails);
		}
	@PostMapping("/add")
	public ResponseEntity insertData(@RequestBody TraineeDetails traineeDetails) {
		service.addTrainee(traineeDetails);
		return new ResponseEntity(HttpStatus.OK);
	}
	@PutMapping("/update")
	public ResponseEntity updateData(@RequestBody TraineeDetails traineeDetails) {
		service.updateTrainee(traineeDetails);
		return new ResponseEntity(HttpStatus.OK);
	}

	@DeleteMapping("/delete")
	public ResponseEntity deleteTrainee(@RequestBody int tId) {
		service.deleteTrainee(tId);
		return new ResponseEntity(HttpStatus.OK);
		
	}
	@GetMapping("/getById")
	public ResponseEntity getByTid(@RequestBody int tId) {
		TraineeDetails traineeDetails=service.getByTid(tId);
		if(traineeDetails==null) {
			//throw new UserNotFoundException("user not found "+pId);
			return null;
		}
		else
			return new ResponseEntity("success",HttpStatus.OK);
		
	}

	@GetMapping("/getAll")
	public ArrayList<TraineeDetails> getAllTraineeDetails(){
		ArrayList<TraineeDetails> traineeDetails = service.getAll();
		return traineeDetails;
	}
}
