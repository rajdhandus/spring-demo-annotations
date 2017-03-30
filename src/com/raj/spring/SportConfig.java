package com.raj.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.raj.spring")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	@Bean
	public FortuneService sadFortuneService(){
		return new SadFortuneService();
	}
	
	@Bean
	public SwimCoach swimCoach(){
		return new SwimCoach(sadFortuneService());
	}
	
//	@Bean
//	public KabadiCoach kabadiCoach(){
//		return new KabadiCoach(sadFortuneService());
//	}

}
