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
public class KabadiCoach implements Coach {

	/**
	 * 
	 */
	public KabadiCoach() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.raj.spring.Coach#getWorkoutInfo()
	 */
	@Override
	public String getWorkoutInfo() {
		// TODO Auto-generated method stub
		return "Say Kabadi Kabadi 50 times a day! ;)";
	}

}
