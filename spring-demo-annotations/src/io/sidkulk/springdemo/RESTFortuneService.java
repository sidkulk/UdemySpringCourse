package io.sidkulk.springdemo;

import org.springframework.stereotype.Component;

@Component("restFullService")
public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Rest fortune service";
	}

}
