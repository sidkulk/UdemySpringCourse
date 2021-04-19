package io.sidkulk.springdemo;

import org.springframework.stereotype.Component;
/**
 * This class provides an implementation for FortuneService Interface
 * @author siddharth
 *
 */
@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Happy Fortune Service method implementation";
	}

}
