package com.SpringCRUD.CrudDemo.Services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringCRUD.CrudDemo.Models.Students;
import com.SpringCRUD.CrudDemo.Repo.StudentRepo;

@Service
public class ServicesImpl implements Services{
	
	@Autowired
	StudentRepo sr;
	
	
	// Data storing API
	@Override
	public String studentStore(ArrayList<Students> s) {
		
		try 
		{
			sr.saveAll(s);
			sr.flush();
			return "Data saved !";
		}
		catch(Exception e)
		{
			return "Exception occured !";
		}
		
	}


	@Override
	public ArrayList<Students> getStudents() {
		
		return (ArrayList<Students>) sr.findAll();
	}


	@Override
	public String updateStudent(Students s) {
		try 
		{
			sr.save(s);
			sr.flush();
			return "Data updated !";
		}
		catch(Exception e)
		{
			return "Exception Occured !";
		}
	}


	@Override
	public String deleteData(int id) {
		
		try 
		{
			sr.deleteById(id);
			return "Data deleted !";
		}
		catch(Exception e)
		{
			return "Exception Occured !";
		}
	}

}
