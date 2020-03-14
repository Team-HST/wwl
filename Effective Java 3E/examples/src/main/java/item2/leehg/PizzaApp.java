package item2.leehg;

/**
 * @author dlgusrb0808@gmail.com
 */
public class PizzaApp {

	public static void main(String[] args) {
		NyPizza nyPizza = new NyPizza.Builder(NyPizza.Size.LARGE)
				.addTopping(Pizza.Topping.HAM)
				.addTopping(Pizza.Topping.MUSHROOM)
				.build();

		CalzonePizza calzonePizza = new CalzonePizza.Builder()
				.addTopping(Pizza.Topping.HAM)
				.sauceInside()
				.build();

		// 공변 반환 타이핑을 이용하지 않은 경우 (형변환 필요)
		HoneyPizza honeyPizza = (HoneyPizza) new HoneyPizza.Builder()
				.addTopping(Pizza.Topping.ONION)
				.build();

		System.out.println(nyPizza);
		System.out.println(calzonePizza);
		System.out.println(honeyPizza);
	}

}
