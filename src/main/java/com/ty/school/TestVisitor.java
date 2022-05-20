package com.ty.school;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestVisitor {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Visitor v = new Visitor();
		
		 
		v.setId(2);
		v.setName("aksha");
		v.setEmail("aksha@gmail.com");
		v.setDOB(LocalDate.now());
		v.setVisitdateandtime(LocalDateTime.now());
		
		
		et.begin();
		em.persist(v);
		et.commit();
		System.out.println("-----------------");
	
	

	}
}
