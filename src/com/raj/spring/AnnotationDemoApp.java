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
		
		// should follow the naming standard to retrieve the bean as @Component doesn't specific bean id name
		KabadiCoach theCoach = context.getBean("kabadiCoach", KabadiCoach.class); 
		
		System.out.println(theCoach.getWorkoutInfo());
		System.out.println(theCoach.getFortune());
		System.out.println(theCoach.getTeamName());
		System.out.println(theCoach.getEmailID());
		
		context.close();

	}

}
