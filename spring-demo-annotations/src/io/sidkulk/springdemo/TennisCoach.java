package io.sidkulk.springdemo;

import org.springframework.stereotype.Component;

@Component("thatTennisCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "practice your backhand volley";
	}
}
