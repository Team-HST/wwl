package item5.yhkim;

import java.util.function.Supplier;

public class ConsumerTest {
    private static int age = 29;

    private static final ConsumerTest INSTANCE = new ConsumerTest();

    private ConsumerTest() {};

    public static ConsumerTest getInstance(Supplier<ConsumerTest> supplier) {
        return supplier.get();
    }

    public static void printAge(int age) {
        System.out.println(age);
    }
}
