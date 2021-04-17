package io.sidkulk;

public class MyApp {
	public static void main(String[] args) {

		// create obj
		Coach coach = new BaseBallCoach();
		Coach trackCoach = new TrackCoach();

		// use obj
		System.out.println(coach.getDailyWorkout());
		System.out.println(trackCoach.getDailyWorkout());

	}
}
