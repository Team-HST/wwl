package item5.yhkim;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        consumerTest(29, ConsumerTest::printAge);
    }

    public static void consumerTest(int age, Consumer<Integer> consumer) {
        consumer.accept(age);
    }
}
