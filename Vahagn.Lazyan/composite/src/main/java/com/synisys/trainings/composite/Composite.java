package com.synisys.trainings.composite;

import com.synisys.trainings.composite.api.Condition;
import com.synisys.trainings.composite.impl.*;

import java.time.Duration;
import java.util.List;

import static java.util.List.of;

public class Composite {

	public static void main(String[] args) {
		Condition condition = new AndCondition(
				of(
						new NotCondition(
								new OrCondition(
										of(
												new EqCondition<>(0L, Math.round(Math.random())),
												new InCondition<>(13, List.of(1, 3, 7, 43)),
												new LessThanCondition<>("14", "130")
										)
								)
						),
						new GreaterThanCondition<>(Duration.ofDays(123), Duration.ofHours(2852))
				)
		);

		System.out.printf("Provided condition is %s.%n", condition.evaluate() ? "true" : "false");
	}
}
