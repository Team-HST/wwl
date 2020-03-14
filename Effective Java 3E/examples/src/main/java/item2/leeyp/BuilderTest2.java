package item2.leeyp;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

import item2.leeyp.NyPizza.Size;
import item2.leeyp.Pizza.Topping;

public class BuilderTest2 {

	public static void main(String[] args) {
		NyPizza pizza = new NyPizza.Builder(Size.LARGE).addTopping(Topping.PEPPR).addTopping(Topping.HAM).build();
		System.out.println(pizza);
		System.out.println(pizza.toppings);
		
		Set<Topping> toppingSet = pizza.toppings;
		Iterator<Topping> iterator = toppingSet.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	}
}

abstract class Pizza {
	public enum Topping { HAM, MUSHROOM, ONION, PEPPR, SAUSAGE }
	final Set<Topping> toppings;
	
	abstract static class Builder<T extends Builder<T>> {
		EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
		public T addTopping(Topping topping) {
			toppings.add(Objects.requireNonNull(topping));
			return self();
		}
		
		abstract Pizza build();
		
		protected abstract T self();
	}
	
	Pizza(Builder<?> builder) {
		toppings = builder.toppings.clone();
	}

	@Override
	public String toString() {
		return "Pizza [toppings=" + toppings + "]";
	}
	
}

class NyPizza extends Pizza {

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
		protected Builder self() {
			return this;
		}
		
	}
	
	private NyPizza(Builder builder) {
		super(builder);
		size = builder.size;
	}

/*	@Override
	public String toString() {
		return "NyPizza [size=" + size + "]";
	}*/
	
}
