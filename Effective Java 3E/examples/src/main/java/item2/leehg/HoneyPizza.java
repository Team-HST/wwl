package item2.leehg;

/**
 * @author dlgusrb0808@gmail.com
 */
public class HoneyPizza extends Pizza {

	public static class Builder extends Pizza.Builder<Builder> {
		@Override
		Pizza build() {
			return new HoneyPizza(this);
		}

		@Override
		public Builder self() {
			return this;
		}
	}

	public HoneyPizza(Builder builder) {
		super(builder);
	}
}
