package item3.yhkim;

import java.io.Serializable;

public class Single implements Serializable {
    public int age = 20;
    public static final Single INSTANCE = new Single();

    // private를 통한 인스턴스화 불가
    private Single() {};
}
