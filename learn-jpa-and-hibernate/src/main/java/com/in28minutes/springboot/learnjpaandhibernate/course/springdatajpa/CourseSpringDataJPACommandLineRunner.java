package com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;

@Component
public class CourseSpringDataJPACommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.save(new Course(7,"Learn Only Kubernetes","Sheru"));
		repository.save(new Course(8,"Learn Only Jenkins","Sheru"));
		repository.save(new Course(9,"Learn Only Netsuite","kartheya"));
	
		repository.deleteById(7l);
		
		Optional<Course> courseObj = repository.findById(8l);
		Course course;
		if(courseObj.isPresent())
			course = courseObj.get();
		
		System.out.println("All Available Courses in the table");
		List<Course> courses = repository.findAll();
		courses.forEach(System.out::println);	
		
		List<Course> authorSpecificCourses = repository.findByAuthor("sheru");
		System.out.println("Author Specific Courses");
		authorSpecificCourses.forEach(System.out::println);
		
	}
	
	
	
}
