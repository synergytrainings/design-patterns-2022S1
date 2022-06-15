package com.synisys.trainings.bridge.language;

import java.util.Map;

public final class EnglishLanguage extends Language {

	private static final Map<String, String> dictionary = Map.of(
			"spas", "Spas",
			"kyalagyosh", "Kyalagyash",
			"summertime", "Summertime",
			"dolma", "Dolma",
			"harisa", "Harisa",
			"french_onion", "French Onion Soup",
			"lobster_bisque", "Lobster Bisque Soup",
			"french_bistro", "French Bistro Salad",
			"boeuf_bourguignon", "Boeuf Bourguignon",
			"chicken_cordon_bleu", "Chicken Cordon Bleu"
	);

	@Override
	protected Map<String, String> getDictionary() {
		return dictionary;
	}
}
