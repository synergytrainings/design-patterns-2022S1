package com.synisys.trainings.bridge;

import com.synisys.trainings.bridge.language.ArmenianLanguage;
import com.synisys.trainings.bridge.language.EnglishLanguage;
import com.synisys.trainings.bridge.menu.ArmenianCuisine;
import com.synisys.trainings.bridge.menu.FrenchCuisine;
import com.synisys.trainings.bridge.menu.Menu;

public class Bridge {

	public static void main(String[] args) {

		var armenian = new ArmenianLanguage();
		var english = new EnglishLanguage();

		Menu menu = new ArmenianCuisine(armenian);
		System.out.println("Հայկական Խոհանոց");
		printAllMenuItems(menu);

		menu = new ArmenianCuisine(english);
		System.out.println("Armenian Cuisine");
		printAllMenuItems(menu);

		menu = new FrenchCuisine(armenian);
		System.out.println("Ֆրանսիական Խոհանոց");
		printAllMenuItems(menu);

		menu = new FrenchCuisine(english);
		System.out.println("French Cuisine");
		printAllMenuItems(menu);
	}

	public static void printAllMenuItems(Menu menu) {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
		menu.getMainDishes().forEach(System.out::println);
		menu.getSalads().forEach(System.out::println);
		menu.getSoups().forEach(System.out::println);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<");
	}
}
