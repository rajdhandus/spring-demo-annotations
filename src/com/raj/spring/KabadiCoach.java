/**
 * 
 */
package com.raj.spring;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	private FortuneService fortuneService;
	
	@Autowired
	public KabadiCoach(FortuneService theFortuneService) {
		// TODO Auto-generated constructor stub
		this.fortuneService = theFortuneService;
	}

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

}
