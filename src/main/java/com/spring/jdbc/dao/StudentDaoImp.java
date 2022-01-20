package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entities.Student;

public class StudentDaoImp implements StudentDao{
	private JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int change(Student student) {
		
		//Update data in student table
		String query = "update student set name=? , city=? where id=?";
		int r = this.jdbcTemplate.update(query , student.getName() ,student.getCity(), student.getId());
		return r;
	}
	
	public	int insert(Student student) {
		
		//insert data in student table
		String query = "insert into student(id , name , city) values(?,?,?)";
		int r = this.jdbcTemplate.update(query ,student.getId() , student.getName(),student.getCity());
		return r;
		
	}
	public int delete(Student student) {
		
		// Delete data from student table
		String query = "delete from student where id=?";
		int del = this.jdbcTemplate.update(query, student.getId());
		return del;
	}
	

}
