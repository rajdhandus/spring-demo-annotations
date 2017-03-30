package com.raj.spring;

public class HockeyCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public HockeyCoach(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}

	@Override
	public String getWorkoutInfo() {
		// TODO Auto-generated method stub
		return "Skate 1 hour every day!!";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}

}
