package com.raj.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.raj.spring")
public class SportConfig {
	
	@Bean
	public FortuneService sadFortuneService(){
		return new SadFortuneService();
	}
	
	@Bean
	public SwimCoach swimCoach(){
		return new SwimCoach(sadFortuneService());
	}

}
