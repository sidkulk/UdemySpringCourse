package io.sidkulk;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrive a spring bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach eslCoach = context.getBean("myESL", Coach.class);
		Coach trackCoach = context.getBean("myTrackCoach", Coach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(eslCoach.getDailyWorkout());
		
		//call out new method for fortune
		System.out.println(theCoach.getDailyFortune());
		System.out.println(trackCoach.getDailyFortune());
		
		//close the context
		context.close();
	}
}
