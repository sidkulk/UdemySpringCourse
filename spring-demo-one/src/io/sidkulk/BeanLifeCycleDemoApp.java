package io.sidkulk;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		//	load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//	retrive bean from spring container
		Coach theCoach = context.getBean("myTrackCoach", Coach.class);
		Coach alphaCoach = context.getBean("myTrackCoach", Coach.class);
		
		System.out.println(alphaCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}
}
