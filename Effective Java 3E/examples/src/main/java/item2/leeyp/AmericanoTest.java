package item2.leeyp;

import java.util.Objects;

import item2.leeyp.Americano.Ice;
import item2.leeyp.Americano.Type;
import item2.leeyp.Coffee.Size;

public class AmericanoTest {

	public static void main(String[] args) {
		Americano americano = new Americano.Builder(Size.LARGE, Type.ICE, Ice.LESS).build();
		CaffeMocca caffeMocca = new CaffeMocca.Builder(Size.SMALL, item2.leeyp.CaffeMocca.Type.HOT).whipping(true).build();
		System.out.println(americano.toString());
		System.out.println(caffeMocca.toString());
	}

}

abstract class Coffee {
	public enum Size { SMALL, REGULAR, LARGE }
	final Size size;
	
	abstract static class Builder<T extends Builder<T>> {
		private Size size;

		public Builder(Size size) {
			if (size == null) {
				throw new IllegalArgumentException("===================== SIZE IS REQUIRED");
			}
			this.size = size;
		}
		
		abstract Coffee build();
		
		protected abstract T self();
	}
	
	public Coffee(Builder<?> builder) {
		size = builder.size;
	}
}

class Americano extends Coffee {
	public enum Type { ICE, HOT }
	private final Type type;
	public enum Ice { LESS, REGULAR, FULL }
	private final Ice ice;
	private final boolean syrup;
	
	static class Builder extends Coffee.Builder<Builder> {
		private final Type type;
		private final Ice ice;
		private boolean syrup = false;
		
		public Builder(Size size, Type type, Ice ice) {
			super(size);
			if (type == null) {
				throw new IllegalArgumentException("===================== TYPE IS REQUIRED");
			}
			if (ice == null) {
				throw new IllegalArgumentException("===================== ICE IS REQUIRED");
			}
			this.type = Objects.requireNonNull(type);
			this.ice = Objects.requireNonNull(ice);
		}
		
		public Builder syrup(boolean val) {
			syrup = val;
			return this;
		}

		@Override
		Americano build() {
			return new Americano(this);
		}

		@Override
		protected Builder self() {
			return this;
		}
	}
	
	public Americano(Builder builder) {
		super(builder);
		type = builder.type;
		ice = builder.ice;
		syrup = builder.syrup;
	}

	@Override
	public String toString() {
		return "Americano [size=" + size + ", type=" + type + ", ice=" + ice + ", syrup=" + syrup + "]";
	}
	
}

class CaffeMocca extends Coffee {
	public enum Type { ICE, HOT }
	private final Type type;
	private final boolean whipping;
	
	static class Builder extends Coffee.Builder<Builder> {
		private final Type type;
		private boolean whipping = false;
		
		public Builder(Size size, Type type) {
			super(size);
			if (type == null) {
				throw new IllegalArgumentException("====================== TYPE IS REQUIRED");
			}
			this.type = Objects.requireNonNull(type);
		}
		
		public Builder whipping(boolean val) {
			whipping = val;
			return this;
		}
		
		@Override
		CaffeMocca build() {
			return new CaffeMocca(this);
		}

		@Override
		protected Builder self() {
			return this;
		}
		
	}
	public CaffeMocca(Builder builder) {
		super(builder);
		type = builder.type;
		whipping = builder.whipping;
	}
	@Override
	public String toString() {
		return "CaffeMocca [size=" + size + ", type=" + type + ", whipping=" + whipping + "]";
	}
	
	
}