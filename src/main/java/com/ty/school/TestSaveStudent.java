package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveStudent {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Student s = new Student();
		s.setId(2);
		s.setName("hema");
		s.setPer(71.06);
		
		et.begin();
		em.persist(s);
		et.commit();
		System.out.println("----------done----------");
		
		
		}
}
