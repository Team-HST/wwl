package item2.leehg;

import java.util.Objects;

/**
 * @author dlgusrb0808@gmail.com
 */
public class NyPizza extends Pizza {
	public enum Size { SMALL, MEDIUM, LARGE }
	private final Size size;

	public static class Builder extends Pizza.Builder<Builder> {
		private final Size size;

		public Builder(Size size) {
			this.size = Objects.requireNonNull(size);
		}

		@Override
		NyPizza build() {
			return new NyPizza(this);
		}

		@Override
		public Builder self() {
			return this;
		}
	}

	NyPizza(Builder builder) {
		super(builder);
		this.size = builder.size;
	}
}
