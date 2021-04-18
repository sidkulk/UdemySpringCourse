package io.sidkulk.springdemo;

import org.springframework.stereotype.Component;

/**
 * <p>
 * This is a default component class. No explicit component ID provided.
 * The component ID in this case will be the lower-case first letter of class name.
 * <p>
 * @author siddharth
 * @see ID: fuseBallCoach
 */

@Component
public class FuseBallCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "practice 4 table rounds";
	}
}
