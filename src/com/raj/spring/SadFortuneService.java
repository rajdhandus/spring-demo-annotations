package com.raj.spring;

public class SadFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Today is a sad Day!! :'(";
	}

}
