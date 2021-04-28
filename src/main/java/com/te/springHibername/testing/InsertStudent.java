package com.te.springHibername.testing;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springHibername.bean.Adress;
import com.te.springHibername.bean.Student;
import com.te.springHibername.config.EntityManagerFactoryConfig;

public class InsertStudent {


	public static void main(String[] args) {
		
		Adress adress1 = new Adress();
		adress1.setPincode(577228);
		adress1.setCity("shimoga");
		adress1.setState("karnatake");
		
		
		Student student1 = new Student();
		student1.setId(48);
		student1.setName("Sowjanya");
		
		student1.setAdress(adress1);
		student1.setGender("female");
		adress1.setStudent(student1);
		
		
ApplicationContext context = new AnnotationConfigApplicationContext(EntityManagerFactoryConfig.class);
		
		EntityManagerFactory  entitymanagerfactory  =  context.getBean(EntityManagerFactory.class);
		    
		       EntityManager entitymanager  =  entitymanagerfactory.createEntityManager();
		       
		              EntityTransaction transaction =    entitymanager.getTransaction();
		              
		              transaction.begin();	
		              entitymanager.persist(student1);
		              entitymanager.persist(adress1);
		              transaction.commit();
		              System.out.println("sucessfully inserted the student information");
		              	   

	}
}
