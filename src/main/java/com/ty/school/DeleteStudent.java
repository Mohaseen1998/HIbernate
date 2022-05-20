package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteStudent {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Student s =em.find(Student.class, 1);
		if( s!= null) {
			et.begin();
			em.remove(s);
			et.commit();
		}
		else {
			System.out.println(" no record to be deleted ");
		}
		
	}
}