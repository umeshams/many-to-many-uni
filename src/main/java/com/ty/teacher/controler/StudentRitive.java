package com.ty.teacher.controler;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.teacher.dto.Course;
import com.ty.teacher.dto.Student;

public class StudentRitive {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	Course course = entityManager.find(Course.class, 1);
    
	System.out.println("id is :"+course.getId());
	System.out.println("name is :"+course.getName());
	System.out.println("cost is :"+course.getCost());
	List<Student> student=course.getStudents(); 
	
	for(Student student2:student) {
		System.out.println(student2.getName());
		System.out.println(student2.getAge());
	}
	
}
}
