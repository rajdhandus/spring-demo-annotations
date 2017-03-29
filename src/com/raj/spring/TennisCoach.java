package com.raj.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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
	
	public TennisCoach() {
		System.out.println("Inside default constructor for Tennis Coach");
}
	
	@PostConstruct
	public void doAfterStartup(){
		System.out.println("Inside doAfterStartup");
	}
	
	@PreDestroy
	public void doBeforeDestroy(){
		System.out.println("Inside doBeforeDestroy");
	}

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
