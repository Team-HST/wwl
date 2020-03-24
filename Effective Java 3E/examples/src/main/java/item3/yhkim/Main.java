package item3.yhkim;

import item3.leehg.Serializer;

public class Main {
    public static void main(String[] args) throws Exception {

        Single SINGLE = Single.INSTANCE;
        System.out.println(SINGLE.age);
        byte[] byteSingle = Serializer.serialize(SINGLE);
        Single SINGLE2 = Serializer.deserialize(byteSingle, Single.class);
        System.out.println(SINGLE2.age);
        System.out.println(SINGLE == SINGLE2);

        SafeSingle SAFESINGLE = SafeSingle.INSTANCE;
        System.out.println(SAFESINGLE.age);
        byte[] byteSafeSingle = Serializer.serialize(SAFESINGLE);
        SafeSingle SAFESINGLE2 = Serializer.deserialize(byteSafeSingle, SAFESINGLE.getClass());
        System.out.println(SAFESINGLE2.age);
        System.out.println(SAFESINGLE == SAFESINGLE2);

        System.out.println(EnumSingle.SINGLE.age);
    }
}
