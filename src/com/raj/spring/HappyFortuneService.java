package com.raj.spring;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	public HappyFortuneService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Its a happy day !!";
	}

}
