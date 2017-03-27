package com.raj.spring;

import org.springframework.stereotype.Component;

//@Component("theTennisCoach")
@Component
public class TennisCoach implements Coach {

	public TennisCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getWorkoutInfo() {
		// TODO Auto-generated method stub
		return "Practice your backhand topspin";

	}

}
