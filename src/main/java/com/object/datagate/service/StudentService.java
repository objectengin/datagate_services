package com.object.datagate.service;

import java.util.List;

import com.object.datagate.exceptions.ResourceAlreadyExistsException;
import com.object.datagate.model.Student;

public interface StudentService {
	List<Student> findAll();

	Student find(String id);
	
	boolean exists(String id);
	
	Student save(Student student) throws ResourceAlreadyExistsException;
	
	Student update(String id, Student newStudent);
	
	void delete(Student student);
}
