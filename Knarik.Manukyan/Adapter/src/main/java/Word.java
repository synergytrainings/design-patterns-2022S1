public abstract class Word {
	protected String word;
	protected String definition;
	protected String useInSentence;

	public String getWord() {
		return word;
	}

	public int getNumberOfLetters() {
		return word.length();
	}

	public String getDefinition() {
		return definition;
	}

	public String getUseInSentence() {
		return useInSentence;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	public void setUseInSentence(String useInSentence) {
		this.useInSentence = useInSentence;
	}

	abstract WordGender getWordGender();
}

enum WordGender {
	FEMALE, MALE, NEUTRAL
}
