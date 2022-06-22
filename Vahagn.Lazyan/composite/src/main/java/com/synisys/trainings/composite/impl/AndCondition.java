package com.synisys.trainings.composite.impl;

import com.synisys.trainings.composite.api.ComplexCondition;
import com.synisys.trainings.composite.api.Condition;

import java.util.Collection;

public record AndCondition(Collection<Condition> conditions) implements ComplexCondition {

	@Override
	public boolean evaluate() {
		return conditions.stream().allMatch(Condition::evaluate);
	}
}
