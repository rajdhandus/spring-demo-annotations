package com.raj.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("theTennisCoach")
@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;

//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		// TODO Auto-generated constructor stub
//		this.fortuneService = theFortuneService;
//	}

	@Override
	public String getWorkoutInfo() {
		// TODO Auto-generated method stub
		return "Practice your backhand topspin";

	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return this.fortuneService.getDailyFortune();
	}

}
