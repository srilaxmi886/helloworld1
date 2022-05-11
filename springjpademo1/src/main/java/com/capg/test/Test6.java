package com.capg.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capg.entities.Library;
import com.capg.entities.Student;

public class Test6 {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("student");
	    EntityManager em = emf.createEntityManager();
	    
	    em.getTransaction().begin();
	    
	    
	    Student st1 = new Student();
	    st1.setId(100);
	    st1.setName("sri");
	    st1.setFees(200);
	    
	    Student st2 = new Student();
	    st2.setId(101);
	    st2.setName("lucky");
	    st2.setFees(700);
	    
	    em.persist(st1);
	    em.persist(st2);
	    
	    Library lib1 = new Library();
	    lib1.setBookid(1);
	    lib1.setBookname("jpa");
	    lib1.setStud(st1);
	    
	    Library lib2 = new Library();
	    lib2.setBookid(2);
	    lib2.setBookname("java");
	    lib2.setStud(st2);
	    
	    em.persist(lib1);
	    em.persist(lib2);
	    
	    
	    em.getTransaction().commit();
	    
	    em.close();
	    emf.close();
	    
	}

}

