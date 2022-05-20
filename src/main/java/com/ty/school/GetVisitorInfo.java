package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetVisitorInfo {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		Visitor v = em.find(Visitor.class, 10);
		if(v != null) {
			System.out.println(" id :"+ v.getId());
			System.out.println(" name :"+ v.getName());
			System.out.println(" email :"+ v.getEmail());
			System.out.println(" Gender :"+ v.getGender());
			System.out.println(" DOB:"+ v.getDob());
			System.out.println(" time :"+ v.getVisitdateandtime());
		}
		else {
			System.out.println(" visitor not exits");
		}

	}
}
