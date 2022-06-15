package com.synisys.trainings.bridge.language;

import java.util.Map;

public final class ArmenianLanguage extends Language {

	private static final Map<String, String> dictionary = Map.of(
			"spas", "Սպաս",
			"kyalagyosh", "Քյալագյոշ",
			"summertime", "Ամառային",
			"dolma", "Տոլմա",
			"harisa", "Հարիսա",
			"french_onion", "Սոխով ապուր",
			"lobster_bisque", "Լոբստերով ապուր",
			"french_bistro", "Ֆրանսիական բիստրո",
			"boeuf_bourguignon", "Բուրգունդական տավարի միս",
			"chicken_cordon_bleu", "Հավի կորդոն բլյու"
	);

	@Override
	protected Map<String, String> getDictionary() {
		return dictionary;
	}
}
