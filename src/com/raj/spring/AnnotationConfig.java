package com.raj.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationConfig {
	
	@Bean
	public FortuneService superFortuneService(){
		return new SuperFortuneService();
	}
	
	@Bean
	public Coach hockeyCoach(){
		return new HockeyCoach(superFortuneService());
	}

}
