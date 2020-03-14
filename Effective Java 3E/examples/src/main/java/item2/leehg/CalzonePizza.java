package item2.leehg;

/**
 * @author dlgusrb0808@gmail.com
 */
public class CalzonePizza extends Pizza {
	private final boolean sauceInside;

	public static class Builder extends Pizza.Builder<Builder> {
		private boolean sauceInside = false;

		public Builder sauceInside() {
			this.sauceInside = true;
			return this;
		}

		@Override
		CalzonePizza build() {
			return new CalzonePizza(this);
		}

		@Override
		public Builder self() {
			return this;
		}
	}

	private CalzonePizza(Builder builder) {
		super(builder);
		this.sauceInside = builder.sauceInside;
	}
}
