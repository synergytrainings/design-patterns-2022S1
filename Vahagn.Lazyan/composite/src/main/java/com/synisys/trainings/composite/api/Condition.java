package com.synisys.trainings.composite.api;

public sealed interface Condition permits SimpleCondition, ComplexCondition {

	boolean evaluate();
}
