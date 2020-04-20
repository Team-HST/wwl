package item14.leehg;

/**
 * @author dlgusrb0808@gmail.com
 */
public class CompareTest {
    public static void main(String[] args) {
        PhoneNumber pn1 = PhoneNumber.of(1, 2, 3);
        PhoneNumber pn2 = PhoneNumber.of(2, 2, 3);

        System.out.println(pn1.compareTo(pn2));
    }

}
