package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseJDBCRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.insertData(new Course(1,"Learn Spring JDBC","Sheru"));
		repository.insertData(new Course(2,"Learn  JDBC","Sheru"));
		repository.insertData(new Course(3,"Learn Spring JPA","Sheru"));
		repository.deleteCourseById();
		System.out.println(repository.findCourseById(3));
	}

	
}
