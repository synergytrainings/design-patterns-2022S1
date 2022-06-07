import java.util.Arrays;
import java.util.stream.Collectors;

public class ChineseWordAdapter extends Word {
	private final ChineseWord chineseWord;

	public ChineseWordAdapter(ChineseWord chineseWord) {
		this.chineseWord = chineseWord;
	}

	public String getWord() {
		return Arrays.stream(chineseWord.getWord()).map(word -> word.pinyin).collect(Collectors.joining());
	}

	public int getNumberOfLetters() {
		return chineseWord.getWord().length;
	}

	public String getDefinition() {
		return definition;
	}

	public String getUseInSentence() {
		return null;
	}

	public WordGender getWordGender() {
		return WordGender.NEUTRAL;
	}
}
