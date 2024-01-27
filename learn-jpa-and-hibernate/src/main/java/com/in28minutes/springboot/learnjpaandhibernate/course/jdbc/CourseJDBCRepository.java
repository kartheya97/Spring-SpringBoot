package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;

@Repository
public class CourseJDBCRepository {

	@Autowired
	private JdbcTemplate springJDBCTemplate;
	
	private static String insertQuery = 
			"""
					insert into course(id,name,author) 
					values (?,?,?);
			""";
	private static String delete_query = 
			"""
					delete from course
					where id = '2';
			""";
	
	public static String selectQueryById =
			"""
				 SELECT * FROM course
				 WHERE id = ?;
			""";
	
	public void insertData(Course course) {
		springJDBCTemplate.update(insertQuery,course.getId(),course.getName(),course.getAuthor());
	}
	
	public void deleteCourseById() {
		springJDBCTemplate.update(delete_query);
	}
	
	public Course findCourseById(long id) {
		return springJDBCTemplate.queryForObject(selectQueryById, new BeanPropertyRowMapper<>(Course.class),id);
	}
	
	
}
