package com.ty.school;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetMultipleRecord {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();

		String sql = " SELECT s FROM Student s";
		Query q = em.createQuery(sql);
		List<Student> s = q.getResultList();

		for (Student st : s) {
			System.out.println("ID:" + st.getId());
			System.out.println("name :" + st.getName());
			System.out.println("perc:" + st.getPer()); 

		}

	}
}
