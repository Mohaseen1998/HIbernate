package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetStudentById {
public static void main(String[] args) {
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
	EntityManager em = emf.createEntityManager();
	Student st = em.find(Student.class, 1);
	System.out.println("ID is"+st.getId());
	System.out.println("name is"+st.getName());
	System.out.println("perc is"+st.getPer());
	System.out.println("-----------done-------------");
}
}
