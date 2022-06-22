package com.synisys.trainings.composite.impl;

import com.synisys.trainings.composite.api.ComplexCondition;
import com.synisys.trainings.composite.api.Condition;

public record NotCondition(Condition condition) implements ComplexCondition {

	@Override
	public boolean evaluate() {
		return !condition.evaluate();
	}
}
