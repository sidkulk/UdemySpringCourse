package io.sidkulk.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("thatTennisCoach")
public class TennisCoach implements Coach {

//	private FortuneService fortuneService;
	private FortuneService newFortuneService;
	
	public TennisCoach() {
		System.out.println(">> Debug Msg: entered the default constructor");
	}
	
	//	define a setter method
	
	@Autowired
	public void setFortuneService(FortuneService newFortuneService) {
		System.out.println(">> Debug Msg: Entered the setter method");
		this.newFortuneService = newFortuneService;
	}

//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return newFortuneService.getFortune();
	}
}
