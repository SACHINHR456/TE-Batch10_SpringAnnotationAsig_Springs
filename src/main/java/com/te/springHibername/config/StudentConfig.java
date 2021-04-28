package com.te.springHibername.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springHibername.bean.Student;

@Configuration
public class StudentConfig {
	@Bean
	public Student getStudent() {
		
		
		Student student1 = new Student();
		student1.setId(47);
		student1.setName("Sowjanya");
		student1.setGender("Female");
		
		return student1;
	}

}

