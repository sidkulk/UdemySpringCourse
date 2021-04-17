package io.sidkulk;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		//	load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//	retrive bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//check to see if they are the same beans..
		boolean result = (theCoach == alphaCoach);
		System.out.println("Same beans?: " + result + "\n");
		System.out.println("Memory locations for theCoach: " + theCoach);
		System.out.println("Memory locations for theCoach: " + alphaCoach);
			
		
		context.close();
	}
}
