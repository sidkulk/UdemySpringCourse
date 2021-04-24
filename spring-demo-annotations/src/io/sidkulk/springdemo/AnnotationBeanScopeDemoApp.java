package io.sidkulk.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		//	load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//	retrive a bean from the container
		Coach theCoach = context.getBean("theBasketBallCoach", Coach.class);
		Coach newCoach = context.getBean("theBasketBallCoach", Coach.class);
		
		//	check if they are same
		System.out.println();
		boolean isSame = (newCoach == theCoach);
		System.out.println("pointing to same memory loc: " + isSame);
		System.out.println();
		System.out.println("Memory loc of 1st basketball coach: " + theCoach);
		System.out.println("Memory loc of 2st basketball coach: " + newCoach);
		
		//	close context
		context.close();
	}

}
