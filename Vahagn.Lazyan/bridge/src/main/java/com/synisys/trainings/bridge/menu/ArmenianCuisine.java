package com.synisys.trainings.bridge.menu;

import com.synisys.trainings.bridge.language.Language;
import com.synisys.trainings.bridge.model.MenuItem;
import com.synisys.trainings.bridge.model.MenuItemView;

import java.util.List;

public final class ArmenianCuisine extends Menu {

	private static final List<MenuItem> soups = List.of(
			new MenuItem("spas", 1000),
			new MenuItem("kyalagyosh", 1500)
	);
	private static final List<MenuItem> salads = List.of(
			new MenuItem("summertime", 1200)
	);
	private static final List<MenuItem> mainDishes = List.of(
			new MenuItem("dolma", 3200),
			new MenuItem("harisa", 2000)
	);

	public ArmenianCuisine(Language language) {
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
