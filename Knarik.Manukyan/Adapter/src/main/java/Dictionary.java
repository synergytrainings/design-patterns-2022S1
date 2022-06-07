import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Dictionary {
	static Map<Word, Word> map = new HashMap<>();
	void addTranslation(Word word1, Word word2){
		map.put(word1, word2);
	}

	void translate(Word[] sentence){
		System.out.println(Arrays.stream(sentence)
				.map(map::get)
				.map(Word::getWord)
				.collect(Collectors.joining(" ")));
	}

	public static void main(String[] args) {
		Dictionary dictionary = new Dictionary();

		EnglishWord i = new EnglishWord("I");
		EnglishWord love = new EnglishWord("love");
		EnglishWord armenia = new EnglishWord("Armenia");
		ChineseCharacter[] chineseI = {new ChineseCharacter("我", "Wǒ", Tone.THIRD)};
		ChineseCharacter[] chineseLove = {new ChineseCharacter("爱", "ài", Tone.FOURTH)};
		ChineseCharacter[] chineseArmenia = {
				new ChineseCharacter("亚", "yà", Tone.FOURTH),
				new ChineseCharacter("美", "měi", Tone.THIRD),
				new ChineseCharacter("尼", "ní", Tone.SECOND),
				new ChineseCharacter("亚", "yǎ", Tone.THIRD),
		};

		dictionary.addTranslation(i, new ChineseWordAdapter(new ChineseWord(chineseI)));
		dictionary.addTranslation(love, new ChineseWordAdapter(new ChineseWord(chineseLove)));
		dictionary.addTranslation(armenia, new ChineseWordAdapter(new ChineseWord(chineseArmenia)));

		dictionary.translate(new EnglishWord[]{i, love, armenia});
	}
}
