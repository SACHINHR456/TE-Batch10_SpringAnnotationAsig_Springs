package com.te.springHibername.testing;


	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.EntityTransaction;
	import javax.persistence.Query;

	import org.springframework.context.ApplicationContext;
	import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springHibername.bean.Adress;
import com.te.springHibername.bean.Student;
import com.te.springHibername.config.EntityManagerFactoryConfig;



	public class DeleteData {

		public static void main(String[] args) {
			

			ApplicationContext context = new AnnotationConfigApplicationContext(EntityManagerFactoryConfig.class);
			
			EntityManagerFactory  entitymanagerfactory  =  context.getBean(EntityManagerFactory.class);
			    
			       EntityManager entitymanager  =  entitymanagerfactory.createEntityManager();
			       
			              EntityTransaction transaction =    entitymanager.getTransaction();
			              
			              transaction.begin();	
			           Student student =    entitymanager.find(Student.class,48);
			           Adress adress=entitymanager.find(Adress.class, 173635);
			           
			         entitymanager.remove(student);	
			         entitymanager.remove(adress);
			         transaction.commit();	
			         System.out.println("sucessfully deleted");
			                            

		}
}
