/**
 * 
 */
package com.raj.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author rajkumarpurushothaman
 *
 */
public class SwimJavaConfigDemoApp {

	/**
	 * 
	 */
	public SwimJavaConfigDemoApp() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// should follow the naming standard to retrieve the bean as @Component doesn't specific bean id name
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class); 
		
		System.out.println(theCoach.getWorkoutInfo());
		System.out.println(theCoach.getFortune());
		System.out.println(theCoach.getEmailID());
		System.out.println(theCoach.getTeamName());
		
		context.close();

	}

}
