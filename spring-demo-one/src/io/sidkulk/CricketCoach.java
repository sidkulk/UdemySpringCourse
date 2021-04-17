package io.sidkulk;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String email;
	private String team;

	public void setEmail(String email) {
		System.out.println("CricketCoach: spring injected email");
		this.email = email;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: spring injected team name");
		this.team = team;
	}

	public String getEmail() {
		return this.email;
	}

	public String getTeam() {
		return this.team;
	}

	// create a no-args constructor
	public CricketCoach() {
		System.out.println("Spring called this constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Practice fast bowling for 15 min";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
