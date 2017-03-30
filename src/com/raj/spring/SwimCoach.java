package com.raj.spring;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
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
