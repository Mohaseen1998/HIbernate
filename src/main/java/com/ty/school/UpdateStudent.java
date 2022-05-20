package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateStudent {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Student s = new Student();
	 s.setId(2);
	 s.setName("aksatha");
	 s.setPer(45.5);
	 
	 et.begin();
	 em.merge(s);
	 et.commit();
	 
	 
}
}
