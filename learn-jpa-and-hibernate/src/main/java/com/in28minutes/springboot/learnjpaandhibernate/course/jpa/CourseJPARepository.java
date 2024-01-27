package com.in28minutes.springboot.learnjpaandhibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJPARepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public void insertCourseToTable(Course course) {
		entityManager.merge(course);
	}
	
	public Course findCourseById(long id) {
		return entityManager.find(Course.class, id);
	}
	
	public void deleteCourseById(long id) {
		Course course = entityManager.find(Course.class, id);
		entityManager.remove(course);
	}
	
}
