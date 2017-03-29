package com.raj.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public AnnotationBeanScopeDemoApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach theOtherCoach = context.getBean("tennisCoach", Coach.class);
		
		boolean result = (theCoach == theOtherCoach);
		
		System.out.println("Both the object are same? " + result);
		
		System.out.println("Memory location of theCoach " + theCoach);
		
		System.out.println("Memory location of theOtherCoach " + theOtherCoach);
		
		context.close();

	}

}
