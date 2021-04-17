package io.sidkulk;

public class BaseBallCoach implements Coach {
	// define a private field
	private GetRandomFortuneService fortuneService;

	// define a constructor for dependency injection
	public BaseBallCoach(GetRandomFortuneService theFortuneService) {
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
		return "From BaseBall Coach: " + fortuneService.getFortune();
	}
}
