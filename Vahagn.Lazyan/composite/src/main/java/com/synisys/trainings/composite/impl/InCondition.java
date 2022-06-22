package com.synisys.trainings.composite.impl;

import com.synisys.trainings.composite.api.SimpleCondition;

import java.util.Collection;

public record InCondition<T>(T leftValue, Collection<T> rightValue) implements SimpleCondition {

	@Override
	public boolean evaluate() {
		return rightValue.contains(leftValue);
	}
}
