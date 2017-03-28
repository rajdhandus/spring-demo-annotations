/**
 * 
 */
package com.raj.spring;

import java.util.Random;

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
	
	private String[] fortunes = {
			"Avoid negative people to stay positive",
			"Do your job to the best of your ability",
			"Be thankful, even if your life is not perfect"
			};
	
	public RandomFortuneService() {
		// TODO Auto-generated constructor stub
	}
	
	private int randomNumberGenerator(){
		Random myRandom = new Random();
		return myRandom.nextInt(fortunes.length);
	}

	/* (non-Javadoc)
	 * @see com.raj.spring.FortuneService#getDailyFortune()
	 */
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortunes[randomNumberGenerator()];
	}

}
