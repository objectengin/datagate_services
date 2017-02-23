package com.object.datagate.service;

import com.object.datagate.exceptions.ResourceAlreadyExistsException;
import com.object.datagate.model.Course;

import java.util.List;

public interface CourseService {
	List<Course> findAll();

	Course find(Integer id);
	
	boolean exists(Integer id);
	
	Course save(Course course) throws ResourceAlreadyExistsException;
	
	Course update(Integer id, Course newCourse);
	
	void delete(Course course);
}
