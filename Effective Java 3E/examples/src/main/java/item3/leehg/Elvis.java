package item3.leehg;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author dlgusrb0808@gmail.com
 */
public class Elvis implements Serializable {
	public static final Elvis INSTANCE = new Elvis();

	private Elvis() {}

	private void writeObject(ObjectOutputStream oos) {
		System.out.println("call writeObject");
	}

	private void readObject(ObjectInputStream ois) {
		System.out.println("call readObject");
	}

	private Object writeReplace() {
		System.out.println("call writeReplace");
		return this;
	}

	private Object readResolve() {
		System.out.println("call readResolve");
		return this;
	}

}
