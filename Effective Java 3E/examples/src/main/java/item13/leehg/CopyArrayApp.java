package item13.leehg;

import java.util.Comparator;

/**
 * @author dlgusrb0808@gmail.com
 */
public class CopyArrayApp {

    public static void main(String[] args) {
        Element[] elements = {new Element(1), new Element(2)};
        Element[] copiedElements = elements.clone();

        System.out.println(elements);
        System.out.println(copiedElements);
    }

    public static class Element {
        Object value;

        public Element(Object value) {
            this.value = value;
        }

        public Object getValue() {


            return value;
        }
    }

}
