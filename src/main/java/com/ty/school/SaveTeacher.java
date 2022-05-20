package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveTeacher {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Teacher t = new Teacher();
		t.setId(3);
		t.setName("hema");
		t.setEmail("hema@gmail.com");
		t.setPhone(96865651);
		t.setGender('F');
		et.begin();
		em.persist(t);
		et.commit();
		System.out.println("-----------------");
	
	
	}

}
