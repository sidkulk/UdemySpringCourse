package io.sidkulk.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotDemoApp {

	public static void main(String[] args) {
		
		//	read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//	get bean from spring container
		Coach theCoach = context.getBean("thatTennisCoach", Coach.class);
		
		//	call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//	close the context
		context.close();
		
	}
}
