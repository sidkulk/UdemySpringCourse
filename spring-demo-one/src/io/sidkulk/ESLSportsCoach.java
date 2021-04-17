package io.sidkulk;

public class ESLSportsCoach implements Coach{
	private GetRandomFortuneService fortuneService;
	
	public ESLSportsCoach(GetRandomFortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice CS:GO compititive for 3hrs followed by Dota2 for 3hrs";
	}

	@Override
	public String getDailyFortune() {
		return "From ESL Coach: " + fortuneService.getFortune();
	}
}
