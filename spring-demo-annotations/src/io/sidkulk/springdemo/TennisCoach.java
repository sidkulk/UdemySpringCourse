package io.sidkulk.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("thatTennisCoach")
public class TennisCoach implements Coach {

//	private FortuneService fortuneService;
	@Autowired
	@Qualifier("restFullService")
	private FortuneService newFortuneService;	//	field Injection
	
	public TennisCoach() {
		System.out.println(">> Debug Msg: entered the default constructor");
	}
	
	//	define a setter method
	
//	@Autowired
//	public void setFortuneService(FortuneService newFortuneService) {	//	setter injection
//		System.out.println(">> Debug Msg: Entered the setter method");
//		this.newFortuneService = newFortuneService;
//	}

//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {	//	Constructor injection
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
