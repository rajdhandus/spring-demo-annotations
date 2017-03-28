/**
 * 
 */
package com.raj.spring;

import org.springframework.stereotype.Component;

/**
 * @author rajkumarpurushothaman
 *
 */
@Component
public class RandomFortuneService implements FortuneService {

	/**
	 * 
	 */
	
	private String[] fortunes = {"","",""};
	
	public RandomFortuneService() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.raj.spring.FortuneService#getDailyFortune()
	 */
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
