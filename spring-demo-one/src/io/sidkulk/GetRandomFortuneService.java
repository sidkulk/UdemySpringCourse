package io.sidkulk;

import java.util.Random;

public class GetRandomFortuneService implements FortuneService {
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		String[] fortunes = {"this is your lucky day",
							"This is not your lucky day",
							"This is definitely not your lucky day"};
		
		int index = myRandom.nextInt(fortunes.length);
		
		return fortunes[index];
	}

}
