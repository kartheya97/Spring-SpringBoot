package com.in28minutes.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.CourseJPARepository;

@Component
public class CourseJPACommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseJPARepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.insertCourseToTable(new Course(4,"Learn Only  AWS","Sheru"));
		repository.insertCourseToTable(new Course(5,"Learn  Only Azure","Sheru"));
		repository.insertCourseToTable(new Course(6,"Learn Only GCP","Sheru"));
		repository.deleteCourseById(4);
		System.out.println(repository.findCourseById(6));
	}

	
}
