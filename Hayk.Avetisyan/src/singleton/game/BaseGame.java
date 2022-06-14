package singleton.game;

import java.util.Random;

abstract class BaseGame implements Game {

	protected Random generator = new Random();
	protected GameConfigurations configurations;

	protected BaseGame(GameConfigurations configurations) {
		this.configurations = configurations;
	}
}
