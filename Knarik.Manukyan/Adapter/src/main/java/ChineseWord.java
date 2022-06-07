public class ChineseWord {

	private final ChineseCharacter[] word;

	ChineseWord(ChineseCharacter[] word) {
		this.word = word;
	}

	public ChineseCharacter[] getWord() {
		return word;
	}

}

class ChineseCharacter {
	String character;
	String pinyin;
	Tone tone;

	public ChineseCharacter(String character, String pinyin, Tone tone) {
		this.character = character;
		this.pinyin = pinyin;
		this.tone = tone;
	}
}

enum Tone {
	FIRST, SECOND, THIRD, FOURTH, FIFTH
}
