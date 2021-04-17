package io.sidkulk;

public class BaseBallCoach implements Coach {
	// define a private field
	private FortuneService fortuneService;

	// define a constructor for dependency injection
	public BaseBallCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	
	
	public BaseBallCoach() {
		super();
	}



	@Override
	public String getDailyWorkout() {
		return "spend 30 min on batting practice";
	}

	@Override
	public String getDailyFortune() {

		// use my fortuneService to get the fortune
		return fortuneService.getFortune();
	}
}
