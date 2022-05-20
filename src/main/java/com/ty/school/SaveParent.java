package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveParent {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Parent p = new Parent();
		
		p.setEmail("ramu@gmail.com");
		p.setNamre("ramu");
		p.setPhone(6365981);
		et.begin();
		em.persist(p);
		et.commit();

	}
}
