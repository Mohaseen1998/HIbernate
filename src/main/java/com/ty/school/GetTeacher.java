package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetTeacher {
public static void main(String[] args) {
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("vikas");
	EntityManager em = emf.createEntityManager();
	Teacher t = em.find(Teacher.class, 1);
	if(t != null) {
		System.out.println("ID :"+ t.getId());
		System.out.println("name:"+ t.getName());
		System.out.println(" email:"+ t.getEmail());
		System.out.println("phone :"+ t.getPhone());
	}
	else {
		System.out.println(" not exists");
	}
}
}
