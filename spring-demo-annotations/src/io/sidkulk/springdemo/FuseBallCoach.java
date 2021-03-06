package io.sidkulk.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * <p>
 * This is a default component class. No explicit component ID provided. The
 * component ID in this case will be the lower-case first letter of class name.
 * <p>
 * 
 * @author Siddharth T Kulkarni
 * @see ID: fuseBallCoach
 */

@Component
public class FuseBallCoach implements Coach {

	@Autowired
	@Qualifier("randomService")
	private FortuneService fortuneService;

//	@Autowired
//	public FuseBallCoach(FortuneService fortuneService) {	//	Constructor Injection
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkout() {

		return "practice 4 table rounds";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
