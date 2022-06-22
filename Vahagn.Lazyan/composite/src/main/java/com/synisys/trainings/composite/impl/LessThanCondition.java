package com.synisys.trainings.composite.impl;

import com.synisys.trainings.composite.api.SimpleCondition;

public record LessThanCondition<T extends Comparable<T>>(T leftValue, T rightValue) implements SimpleCondition {

	@Override
	public boolean evaluate() {
		return leftValue.compareTo(rightValue) < 0;
	}
}
