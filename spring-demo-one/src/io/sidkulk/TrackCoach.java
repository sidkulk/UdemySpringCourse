package io.sidkulk;

public class TrackCoach implements Coach {
	private GetRandomFortuneService fortuneService;

	public TrackCoach(GetRandomFortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	public TrackCoach() {
		super();
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "From Track Coach: " + fortuneService.getFortune();
	}
	
	//	add init method
	private void doMyStartupStuff() {
		System.out.println("Startup method called by spring");
	}
	
	//	add destroy method
	private void doCleanUpStuff() {
		System.out.println("destroy method called by spring");
	}
}
