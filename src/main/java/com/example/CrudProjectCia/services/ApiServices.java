package com.example.CrudProjectCia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import com.example.CrudProjectCia.model.Student;
import com.example.CrudProjectCia.repo.repo;





@Service
public class ApiServices {
		@Autowired
		repo stRepo;
		public Student saveDetails(Student e) {
			return stRepo.save(e);
		}
		public List<Student> getDetails()
		{
			return stRepo.findAll();
		}
		public Student updateDetails(Student e1)
		{
			return stRepo.saveAndFlush(e1);
		}
	     public void deleteDetails(int id)
	     {
	    	 stRepo.deleteById(id);
	     }
	     public String add(Student m)
	     {
	    	 stRepo.save(m);
	    	 return "Added";
	     }
	     



}