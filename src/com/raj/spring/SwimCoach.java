package com.raj.spring;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String emailID;
	
	@Value("${foo.team}")
	private String teamName;
	
	
	public String getEmailID() {
		return emailID;
	}

	public String getTeamName() {
		return teamName;
	}

	public SwimCoach(FortuneService theFortuneService){
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getWorkoutInfo() {
		return "Swim 1000 meters butterfly";
	}

	@Override
	public String getFortune() {
		return fortuneService.getDailyFortune();
	}

}
