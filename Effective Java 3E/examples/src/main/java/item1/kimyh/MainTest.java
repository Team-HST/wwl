package item1.kimyh;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class MainTest {
    public static void main(String[] args) {
        Boolean boolObj = valueOf(true);
        Boolean boolObj1 = valueOf(true);

        // 미리 static 메서드로 정의 해놓은 같은 인스턴스
        System.out.println(boolObj.hashCode());
        System.out.println(boolObj1.hashCode());
        System.out.println("boolean : " + boolObj);

        BigInteger bi = new BigInteger(10, 10, new Random());

        System.out.println(bi.bitCount());
        System.out.println(BigInteger.probablePrime(10, new Random()).bitCount());

        int[] sortArr = {1,3,4,2,6};

        Arrays.sort(sortArr);

        System.out.println(Arrays.toString(sortArr));
    }

    public static Boolean valueOf(boolean bool) {
        return bool ? Boolean.TRUE : Boolean.FALSE;
    }
}

