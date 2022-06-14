package singleton.game;

public class RaceGame extends BaseGame {

	protected RaceGame(GameConfigurations configurations) {
		super(configurations);
	}

	@Override
	public int play() {
		return generator.nextInt(10);
	}
}
