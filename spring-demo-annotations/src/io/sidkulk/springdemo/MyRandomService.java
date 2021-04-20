package io.sidkulk.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class MyRandomService implements FortuneService {

	String[] fortuneArray = {"Today is a good day", 
			"Today is not a good day", 
			"Today might be a good day"
	};
	
	@Override
	public String getFortune() {
		
		
		Random random = new Random();
		int index = random.nextInt(fortuneArray.length);
		return fortuneArray[index];
	}

}
