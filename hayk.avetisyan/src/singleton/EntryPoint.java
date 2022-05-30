package singleton;

import singleton.game.Game;
import singleton.game.GameType;
import singleton.storage.DataStorage;
import singleton.storage.StorageProvider;

import java.util.Scanner;

public class EntryPoint {

	public static void main(String[] args) {

		System.out.println("[game]  Choose the game:");
		System.out.println("[game]      [1] Race");
		System.out.println("[game]      [2] Snake");
		GameType type = selectGame();

		Game game = type.game();
		int score = game.play();
		System.out.println("Your score is "+ score);

		// second usage of singleton pattern
		DataStorage storage = StorageProvider.provide();
		boolean status = storage.save(score);
		System.out.println("Your score has"+ (status ? " " : " not ") + "been saved in the storage");
	}

	private static GameType selectGame() {
		Scanner scanner = new Scanner(System.in);
		int type = scanner.nextInt();
		return GameType.valueOf(type - 1);
	}
}
