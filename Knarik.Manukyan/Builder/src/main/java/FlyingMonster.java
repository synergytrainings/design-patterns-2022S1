class FlyingMonster extends Monster {
	final double wingLength;

	public static class HeightBuilder extends Monster.HeightBuilder<Builder> {
		final double wingLength;

		private HeightBuilder(double wingLength) {
			this.wingLength = wingLength;
		}

		@Override
		protected Builder nextBuilder(double height) {
			return new Builder(wingLength, height);
		}

	}

	public static class Builder extends Monster.Builder<Builder> {
		final double wingLength;
		final double height;

		protected Builder(double wingLength, double height) {
			this.wingLength = wingLength;
			this.height = height;
		}

		@Override
		public FlyingMonster build() {
			return new FlyingMonster(this);
		}

		@Override
		protected Builder self() {
			return this;
		}

	}

	FlyingMonster(Builder builder) {
		super(builder, builder.height);
		this.wingLength = builder.wingLength;
	}

	static Monster.HeightBuilder<?> getBuilder(double wingLength) {
		return new HeightBuilder(wingLength);
	}
}
