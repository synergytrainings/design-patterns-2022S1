public abstract class Monster {

	static final int MAX_NUMBER_OF_EYES = 3;
	static final int MAX_NUMBER_OF_HORNS = 2;
	static final int MAX_NUMBER_OF_HEADS = 5;
	final int eyesCount;
	final int hornsCount;
	final int headsCount;
	final double height;
	final String scaryNoise;

	abstract static class HeightBuilder<T extends Builder<T>> {

		public T heightInCM(double heightInCM) {
			return nextBuilder(heightInCM);
		}

		public T heightInInches(double inches) {
			return nextBuilder(inches * 2.54);
		}

		protected abstract T nextBuilder(double height);

	}

	abstract static class Builder<T extends Builder<T>> {

		private int eyesCount = 2;
		private int hornsCount = 0;
		private int headsCount = 1;
		String scaryNoise = "Aaaaaaagggghhhh!";

		public T addEyes(int numberOfEyes) {
			if(numberOfEyes > Monster.MAX_NUMBER_OF_EYES){
				throw new IllegalArgumentException("Stop! Who do you think I am? A fly?");
			}
			this.eyesCount = numberOfEyes;
			return self();
		}

		public T addHorns(int numberOfHorns) {
			if(numberOfHorns > Monster.MAX_NUMBER_OF_HORNS){
				throw new IllegalArgumentException(String.format("I am sorry, where have you seen a monster with %d horns?", numberOfHorns));
			}
			this.hornsCount = numberOfHorns;
			return self();
		}

		public T addHeads(int numberOfHeads) {
			if(numberOfHeads > Monster.MAX_NUMBER_OF_HEADS){
				throw new IllegalArgumentException("Wow, that's a lot of heads! What if all of them start to spin?");
			}
			this.headsCount = numberOfHeads;
			return self();
		}

		public T addNoise(String noise) {
			if(noise == null || noise.trim().equals("")){
				throw new IllegalArgumentException("I am a monster. I should make a noise. Am I a joke to you?");
			}
			this.scaryNoise = noise;
			return self();
		}

		abstract Monster build();

		protected abstract T self();

	}

	Monster(Builder<?> builder, double height) {
		this.eyesCount = builder.eyesCount;
		this.hornsCount = builder.hornsCount;
		this.headsCount = builder.headsCount;
		this.scaryNoise = builder.scaryNoise;
		this.height = height;
	}

}

