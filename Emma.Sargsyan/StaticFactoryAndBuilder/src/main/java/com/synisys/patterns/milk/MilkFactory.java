package com.synisys.patterns.milk;

/**
 * Created by emma.sargsyan
 */
public class MilkFactory {

	private MilkFactory() {
	}

	public static Milk getMilk(MilkEnum milkType) {
		switch (milkType) {
			case COCONUT:
				return new CoconutMilk();
			case SOY:
				return new SoyMilk();
			case COW:
			default:
				return new CowMilk();
		}
	}

	public static Milk getDefaultMilk() {
		return new CowMilk();
	}

}
