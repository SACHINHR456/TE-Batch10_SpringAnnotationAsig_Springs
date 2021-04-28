package com.te.springHibername.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springHibername.bean.Adress;

@Configuration
public class AddressConfig {
	@Bean
	public Adress getAdress() {
		Adress adress1 = new Adress();
		adress1.setPincode(577227);
		adress1.setCity("Shimoga");
		adress1.setState("Karnatake");
		return adress1;
		
	}
}
