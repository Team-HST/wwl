package item3.yhkim;

import java.io.Serializable;

public class SafeSingle implements Serializable {
    public static final SafeSingle INSTANCE = new SafeSingle();
    public transient int age = 29;

    private SafeSingle() {};

    private Object readResolve() {
        // 진짜 인스턴스를 반환하고 가짜 인스턴스를 가비지 컬렉터에 맡긴다.
        return INSTANCE;
    }
}
