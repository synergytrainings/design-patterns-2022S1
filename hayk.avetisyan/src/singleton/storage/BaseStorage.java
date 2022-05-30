package singleton.storage;


import singleton.game.GameConfigurations;
import singleton.game.GameType;

import java.util.Random;

abstract class BaseStorage implements DataStorage {

	protected Random generator = new Random();

	@Override
	public boolean save(int score) {
		return generator.nextBoolean();
	}

	@Override
	public GameConfigurations loadConfigurations(GameType type) {
		return null;
	}
}
