package item3.leehg;

/**
 * @author dlgusrb0808@gmail.com
 */
public class Main {
	public static void main(String[] args) throws Exception {
		Elvis instance = Elvis.INSTANCE;
		Elvis testInstance;

		byte[] serialized = Serializer.serialize(instance);
		testInstance = Serializer.deserialize(serialized, Elvis.class);

		System.out.println(instance);
		System.out.println(Elvis.INSTANCE);
		System.out.println(testInstance);
		System.out.println(instance == testInstance);


		SerializeSafeElvis safeInstance = SerializeSafeElvis.INSTANCE;
		SerializeSafeElvis safeTestInstance = null;

		serialized = Serializer.serialize(safeInstance);
		safeTestInstance = Serializer.deserialize(serialized, SerializeSafeElvis.class);

		System.out.println(safeInstance);
		System.out.println(SerializeSafeElvis.INSTANCE);
		System.out.println(safeTestInstance);
		System.out.println(safeInstance == safeTestInstance);
	}
}
