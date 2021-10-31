package com.SpringCRUD.CrudDemo.Services;

import java.util.ArrayList;

import com.SpringCRUD.CrudDemo.Models.Students;

public interface Services {
	
	public String studentStore(ArrayList<Students> s);
	
	public ArrayList<Students> getStudents();
	
	public String updateStudent(Students s);
	
	public String deleteData(int id);
}
