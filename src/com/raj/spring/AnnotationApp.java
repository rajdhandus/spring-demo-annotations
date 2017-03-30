package com.raj.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationApp {
	
	public static void main(String[] args){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
		Coach theCoach = context.getBean("hockeyCoach", Coach.class);
		
		System.out.println(theCoach.getWorkoutInfo());
		System.out.println(theCoach.getFortune());
	}

}
