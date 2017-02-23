package com.object.datagate.dao;

import java.util.List;

import com.object.datagate.model.Student;

public interface StudentDao {

	List<Student> findAll();
	
	Student find(String id);
	
	Student save(Student student);
	
	Student update(String id, Student newStudent);
	
	void delete(Student student);
	
	void deleteById(String id);
}
