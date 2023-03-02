package com.example.CrudProjectCia.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CrudProjectCia.model.Student;





public interface repo extends JpaRepository<Student,Integer> {

	}