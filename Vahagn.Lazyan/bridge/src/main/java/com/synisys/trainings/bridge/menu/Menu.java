package com.synisys.trainings.bridge.menu;


import com.synisys.trainings.bridge.language.Language;
import com.synisys.trainings.bridge.model.MenuItem;
import com.synisys.trainings.bridge.model.MenuItemView;

import java.util.List;

public abstract class Menu {

	protected final Language language;

	protected Menu(Language language) {
		this.language = language;
	}

	public abstract List<MenuItemView> getSoups();

	public abstract List<MenuItemView> getSalads();

	public abstract List<MenuItemView> getMainDishes();

	protected MenuItemView transform(MenuItem menuItem) {
		return new MenuItemView(getTranslation(menuItem.nameId()), menuItem.price());
	}

	protected List<MenuItemView> transformAll(List<MenuItem> items) {
		return items.stream().map(this::transform).toList();
	}

	protected String getTranslation(String key) {
		return language.translate(key);
	}

}
