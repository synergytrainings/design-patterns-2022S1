package com.synisys.trainings.bridge.menu;

import com.synisys.trainings.bridge.language.Language;
import com.synisys.trainings.bridge.model.MenuItem;
import com.synisys.trainings.bridge.model.MenuItemView;

import java.util.List;

public final class FrenchCuisine extends Menu {

	private static final List<MenuItem> soups = List.of(
			new MenuItem("french_onion", 1400),
			new MenuItem("lobster_bisque", 3700)
	);
	private static final List<MenuItem> salads = List.of(
			new MenuItem("french_bistro", 1700)
	);
	private static final List<MenuItem> mainDishes = List.of(
			new MenuItem("boeuf_bourguignon", 2700),
			new MenuItem("chicken_cordon_bleu", 3400)
	);

	public FrenchCuisine(Language language) {
		super(language);
	}

	@Override
	public List<MenuItemView> getSoups() {
		return transformAll(soups);
	}

	@Override
	public List<MenuItemView> getSalads() {
		return transformAll(salads);
	}

	@Override
	public List<MenuItemView> getMainDishes() {
		return transformAll(mainDishes);
	}

}
