package com.ty.teacher.controler;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.teacher.dto.Course;
import com.ty.teacher.dto.Student;

public class StudentTestA {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	Course course=new Course();
	course.setName("mechanical");
	course.setCost(25000);

	List<Student> students=new ArrayList<Student>();
	Student student1=new Student();
	student1.setName("ravi");
	student1.setAge(21);
	students.add(student1);
	
    	Student student2=new Student();
    	student2.setName("ramu");
    	student2.setAge(22);
    	students.add(student2);
    	
    	Student student3=new Student();
    	student3.setName("manju");
    	student3.setAge(23);
    	students.add(student3);
    	
         course.setStudents(students);    	
         
         entityTransaction.begin();
         entityManager.persist(course);
         entityManager.persist(student1);
         entityManager.persist(student2);
         entityManager.persist(student3);
         entityTransaction.commit();
         System.out.println("----------data stored ------------");
}
}
