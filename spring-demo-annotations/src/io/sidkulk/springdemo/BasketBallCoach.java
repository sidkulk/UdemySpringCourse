package io.sidkulk.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("theBasketBallCoach")
@Scope("prototype")
public class BasketBallCoach implements Coach {

	@Autowired
	@Qualifier("myRandomService")
	private FortuneService fortuneService;

//	@Autowired	
//	public BasketBallCoach(FortuneService theFortuneService) {	//	constructor injection
//		fortuneService = theFortuneService;
//	}
	
	public BasketBallCoach() {
		System.out.println(">> Debug Msg: BasketBallCoach default constructor");
	}
	
//	@Autowired
//	public void setFortuneService(FortuneService myFortuneService) {	//	setter injection
//		System.out.println(">> Debug Msg: BasketBallCoach setter method");
//		fortuneService = myFortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "Practice 3 pointer shots";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
