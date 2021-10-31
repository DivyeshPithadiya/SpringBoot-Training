package com.SpringCRUD.CrudDemo.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringCRUD.CrudDemo.Models.Students;
import com.SpringCRUD.CrudDemo.Services.Services;

@RestController
public class MyConroller {
	
	@Autowired
	Services service;

	// Data storing API
	@PostMapping("/studentdata")
	public String hello(@RequestBody ArrayList<Students> s)
	{
		return this.service.studentStore(s);
	}
	
	// Data getting API
	@GetMapping("/getstudents")
	public ArrayList<Students> getStudents()
	{
		return this.service.getStudents();
	}
	
	
	// Data update API
	@PutMapping("/updatestudent")
	public String dataupdate(@RequestBody Students s)
	{
		return this.service.updateStudent(s);
	}
	
	// Data delete
	@DeleteMapping("/deletedata/{id}")
	public String deleteData(@PathVariable int id)
	{
		return this.service.deleteData(id);
	}
	
	
}
