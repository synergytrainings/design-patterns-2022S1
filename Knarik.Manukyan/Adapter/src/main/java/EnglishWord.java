public class EnglishWord extends Word {
	EnglishWord(String word){
		this.word = word;
	}

	public WordGender getWordGender() {
		return WordGender.NEUTRAL;
	}

}
