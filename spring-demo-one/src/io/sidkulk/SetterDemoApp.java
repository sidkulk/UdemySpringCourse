package io.sidkulk;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
	public static void main(String[] args) {

		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrive bean from spring container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);	//CricketCoach bean created..
		ESLSportsCoach eslCoach = context.getBean("myESL", ESLSportsCoach.class);	//ESLSportsCoach bean created..
		TrackCoach track = context.getBean("myTrackCoach", TrackCoach.class);	//TrackCoach bean created..
		BaseBallCoach baseBall = context.getBean("myCoach", BaseBallCoach.class);	//BaseBallCoach bean created..
		
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		
		System.out.println(theCoach.getDailyFortune());
		System.out.println(eslCoach.getDailyFortune());
		System.out.println(track.getDailyFortune());
		System.out.println(baseBall.getDailyFortune());

		// close the context
		context.close();
	}
}
