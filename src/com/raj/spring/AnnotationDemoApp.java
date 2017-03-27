/**
 * 
 */
package com.raj.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author rajkumarpurushothaman
 *
 */
public class AnnotationDemoApp {

	/**
	 * 
	 */
	public AnnotationDemoApp() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("theTennisCoach", Coach.class);
		
		System.out.println(theCoach.getWorkoutInfo());
		
		context.close();

	}

}
