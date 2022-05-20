package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpadateTeacher {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
  Teacher t = new Teacher();
  
    t.setId(2);
	 t.setName("aksatha");
	t.setEmail("ashu@gmail.com");
	t.setGender('m');
	t.setPhone(65654);
	 
	 et.begin();
	 em.merge(t);
	 et.commit();
	
}
}
