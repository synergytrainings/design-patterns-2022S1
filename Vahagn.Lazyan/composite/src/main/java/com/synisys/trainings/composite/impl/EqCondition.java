package com.synisys.trainings.composite.impl;

import com.synisys.trainings.composite.api.SimpleCondition;

import java.util.Objects;

public record EqCondition<T>(T leftValue, T rightValue) implements SimpleCondition {

	@Override
	public boolean evaluate() {
		return Objects.equals(leftValue, rightValue);
	}
}
