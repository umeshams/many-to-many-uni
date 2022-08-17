package com.ty.teacher.controler;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.teacher.dto.Subject;
import com.ty.teacher.dto.Teacher;

public class TeacherRitriveTestB {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Teacher teacher = entityManager.find(Teacher.class, 2);

		System.out.println("teacher id is :" + teacher.getId());
		System.out.println("teacher name is :" + teacher.getName());
		System.out.println("teacher age is :" + teacher.getAge());

		List<Subject> subjects = teacher.getSubjects();
		for (Subject subject : subjects) {
			System.out.println("subject name :" + subject.getName());
			System.out.println("subject days :" + subject.getDay());

		}
	}
}
