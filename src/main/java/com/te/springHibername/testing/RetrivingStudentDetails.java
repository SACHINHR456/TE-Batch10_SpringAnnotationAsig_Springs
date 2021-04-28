package com.te.springHibername.testing;



	import java.util.List;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.EntityTransaction;
	import javax.persistence.Query;

	import org.springframework.context.ApplicationContext;
	import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springHibername.bean.Student;
import com.te.springHibername.config.EntityManagerFactoryConfig;

	


	public class RetrivingStudentDetails {

		public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(EntityManagerFactoryConfig.class);
			
			EntityManagerFactory  entitymanagerfactory  =  context.getBean(EntityManagerFactory.class);
			    
			       EntityManager entitymanager  =  entitymanagerfactory.createEntityManager();
			       
			              EntityTransaction transaction =    entitymanager.getTransaction();
			              
			              transaction.begin();	
			              String query = " from Student";
			                Query issuedquery =   entitymanager.createQuery(query);
			         List<Student> student =    issuedquery.getResultList();
			         transaction.commit();
			         
			         for(Student student1:student)
			         {
			        	 System.out.println(student1.getId());
			        	 System.out.println(student1.getName());
			        	 System.out.println(student1.getGender());
			        	 System.out.println(student1.getAdress().getPincode());
			        	 System.out.println(student1.getAdress().getCity());
			        	 System.out.println(student1.getAdress().getState());
			        	 System.out.println("-----------------------------------------");
			         }
}
	}
