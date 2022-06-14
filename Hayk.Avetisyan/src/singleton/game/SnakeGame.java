package singleton.game;

public class SnakeGame extends BaseGame {

	protected SnakeGame(GameConfigurations configurations) {
		super(configurations);
	}

	@Override
	public int play() {
		return generator.nextInt(2000);
	}
}
