package io.sidkulk.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotDemoApp {

	public static void main(String[] args) {
		
		//	read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//	get bean from spring container
		Coach theCoach = context.getBean("thatTennisCoach", Coach.class);	//explicit bean id
		Coach fuseCoach = context.getBean("fuseBallCoach", Coach.class);	//default bean id
		Coach basCoach = context.getBean("theBasketBallCoach", Coach.class);
		
		//	call methods on the bean
		System.out.println(theCoach.getDailyFortune());
		System.out.println(fuseCoach.getDailyFortune());
		System.out.println(basCoach.getDailyFortune());
		
		//	close the context
		context.close();
		
	}
}
