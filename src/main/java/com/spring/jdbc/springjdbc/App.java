package com.spring.jdbc.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.xml.sax.ext.DeclHandler;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hey wait ! Program running ........");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/springjdbc/jdbc_config.xml");

		StudentDao studentDao = context.getBean("StudentDao", StudentDao.class);

		/*
		 * Student student = new Student(); student.setId(147); //student.setId(297);
		 * student.setName("Sanjay"); //student.setName("Ramesh");
		 * //student.setCity("Sikago"); student.setCity("Samstipur");
		 * 
		 * int result = studentDao.insert(student);
		 * System.out.println("Number of Student inserted....."+ result);
		 */

		/*
		 * Student student = new Student(); student.setId(456);
		 * student.setName("Rakesh"); student.setCity("Siwan");
		 * 
		 * int changed = studentDao.change(student);
		 * System.out.println("number of Changed data ....."+changed);
		 */

		/*
		 * Student student = new Student(); student.setId(456);
		 * 
		 * student.setName(null); student.setCity(null);
		 * 
		 * 
		 * int deleted = studentDao.delete(student);
		 * System.out.println("Number of Data deleted from student is.. "+deleted);
		 */
		/*
		 * Student student1 = studentDao.getStudent(222); System.out.println(student1);
		 */
		
		List<Student> students = studentDao.getAllStud();
		for (Student s : students) {
			System.out.println(s);
		}
	}
}
