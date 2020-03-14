package item2.leehg;

import java.util.EnumSet;
import java.util.Set;

/**
 * @author dlgusrb0808@gmail.com
 */
public abstract class Pizza {
	public enum Topping { HAM, MUSHROOM, ONION }
	final Set<Topping> toppings;

	abstract static class Builder<T extends Builder<T>> {
		EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

		public T addTopping(Topping topping) {
			toppings.add(topping);
			return self();
		}

		abstract Pizza build();

		public abstract T self();
	}

	Pizza(Builder<?> builder) {
		this.toppings = builder.toppings.clone();
	}
}
