package com.synisys.trainings.bridge.language;

import java.util.Map;

public abstract class Language {

	public String translate(String key) {
		return getDictionary().get(key);
	}

	protected abstract Map<String, String> getDictionary();
}
