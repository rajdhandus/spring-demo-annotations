/**
 * 
 */
package com.raj.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author rajkumarpurushothaman
 *
 */
@Component
public class KabadiCoach implements Coach {

	/**
	 * 
	 */
	
	@Value("${foo.email}")
	private String emailID;
	
	@Value("${foo.team}")
	private String teamName;
	
	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
	public KabadiCoach(){
		System.out.println("Kabadi : Inside Default Constructor");
	}
	
	//Setter Injection
	
//	@Autowired
//	public void setFortuneService(FortuneService theFortuneService){
//		System.out.println("Kabadi : Inside the setter method");
//		this.fortuneService = theFortuneService;
//	}
	
	// Constructor Injection
	
//	@Autowired
//	public KabadiCoach(FortuneService theFortuneService) {
//		this.fortuneService = theFortuneService;
//	}

	/* (non-Javadoc)
	 * @see com.raj.spring.Coach#getWorkoutInfo()
	 */
	
	@Override
	public String getWorkoutInfo() {
		// TODO Auto-generated method stub
		return "Say Kabadi Kabadi 50 times a day! ;)";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}
	
	public String getEmailID(){
		return this.emailID;
	}
	
	public String getTeamName(){
		return this.teamName;
	}

}
