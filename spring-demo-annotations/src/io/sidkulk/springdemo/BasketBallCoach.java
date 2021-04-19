package io.sidkulk.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("theBasketBallCoach")
public class BasketBallCoach implements Coach {

	private FortuneService fortuneService;

	@Autowired
	public BasketBallCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice 3 pointer shots";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
