package item3.leehg;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author dlgusrb0808@gmail.com
 */
public class Serializer {

	public static byte[] serialize(Object o) throws Exception {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);

		oos.writeObject(o);
		oos.flush();
		oos.close();

		return baos.toByteArray();
	}

	public static <T> T deserialize(byte[] serialized, Class<T> type) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(serialized));
		Object v = ois.readObject();
		ois.close();
		return (T) v;
	}

}
