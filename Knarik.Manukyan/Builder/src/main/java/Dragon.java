class Dragon extends FlyingMonster {
	final double fireBreathingLength;

	public static class HeightBuilder extends Monster.HeightBuilder<FlyingMonster.Builder> {
		final double wingLength;
		final double fireBreathingLength;

		private HeightBuilder(double wingLength, double fireBreathingLength) {
			this.wingLength = wingLength;
			this.fireBreathingLength = fireBreathingLength;
		}

		@Override
		protected Builder nextBuilder(double height) {
			return new Builder(wingLength, fireBreathingLength, height);
		}

	}

	public static class Builder extends FlyingMonster.Builder {
		final double fireBreathingLength;

		private Builder(double wingLength, double fireBreathingLength, double height) {
			super(wingLength, height);
			this.fireBreathingLength = fireBreathingLength;
		}

		@Override
		public Dragon build() {
			return new Dragon(this);
		}

		@Override
		protected Builder self() {
			return this;
		}

	}

	private Dragon(Builder builder) {
		super(builder);
		this.fireBreathingLength = builder.fireBreathingLength;
	}

	static Monster.HeightBuilder<?> getBuilder(double wingLength, double fireBreathingLength) {
		return new HeightBuilder(wingLength, fireBreathingLength);
	}
}
