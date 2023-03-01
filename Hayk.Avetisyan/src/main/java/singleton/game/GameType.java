package singleton.game;

import singleton.storage.DataStorage;
import singleton.storage.StorageProvider;

/**
 * Enum: an elementary implementation of singleton design pattern
 */
public enum GameType {
	RACE,
	SNAKE;

	public Game game() {


		// first usage of singleton pattern
		GameConfigurations configurations;
		DataStorage storage = StorageProvider.provide();

		// singleton anti pattern
		// instead of loading the game configurations inside of game objects
		// we load them outside and provide them correspondingly
		switch (this) {
			case RACE: {
				configurations = storage.loadConfigurations(RACE);
				return new RaceGame(configurations);
			}
			case SNAKE: {
				configurations = storage.loadConfigurations(SNAKE);
				return new SnakeGame(configurations);
			}
			default: throw new IllegalStateException("There is no such a game");
		}
	}

	public static GameType valueOf(int type) {
		return values()[type];
	}
}
