package item5.yhkim;

import java.util.function.Supplier;

public class AnimalFactory {
    private AnimalFactory() {}

    public static Animal crete(Supplier<? extends Animal> animal) {
        return animal.get();
    }
}
