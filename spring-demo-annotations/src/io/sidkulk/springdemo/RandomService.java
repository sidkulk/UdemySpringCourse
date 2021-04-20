package io.sidkulk.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {

	@Override
	public String getFortune() {
		return "random service impl";
	}

}
