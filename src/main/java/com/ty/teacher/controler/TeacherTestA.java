package com.ty.teacher.controler;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.teacher.dto.Subject;
import com.ty.teacher.dto.Teacher;

public class TeacherTestA {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Teacher teacher = new Teacher();
		teacher.setName("rajiv");
		teacher.setAge(23);

		List<Subject> subjects = new ArrayList<Subject>();
		Subject subject = new Subject();
		subject.setDay(41);
		subject.setName("kannda");
		subjects.add(subject);

		Subject subject1 = new Subject();
		subject1.setDay(55);
		subject1.setName("DSA");
		subjects.add(subject1);

		Subject subject2 = new Subject();
		subject2.setDay(60);
		subject2.setName("kannada");
		subjects.add(subject2);

		teacher.setSubjects(subjects);

		entityTransaction.begin();
		entityManager.persist(teacher);
		entityManager.persist(subject);
		entityManager.persist(subject1);
		entityManager.persist(subject2);
		entityTransaction.commit();
		System.out.println("---------data stored----------- ");
	}
}
