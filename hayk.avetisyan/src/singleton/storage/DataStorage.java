package singleton.storage;

import singleton.game.GameConfigurations;
import singleton.game.GameType;

/**
 * Interface that defines methods to save nad load the game states
 * @see singleton.game.Game
 */
public interface DataStorage {

	boolean save(int score);
	GameConfigurations loadConfigurations(GameType type);
}
