package item14.leehg;

import java.util.Comparator;

/**
 * @author dlgusrb0808@gmail.com
 */
public class PhoneNumber implements Comparable<PhoneNumber> {

    private  static final Comparator<PhoneNumber> PHONE_NUMBER_COMPARATOR =
            Comparator.comparing(PhoneNumber::getAreaCode);

    private int areaCode;
    private int prefix;
    private int lineNum;

    public int getAreaCode() {
        return areaCode;
    }

    public int getPrefix() {
        return prefix;
    }

    public int getLineNum() {
        return lineNum;
    }

    @Override
    public int compareTo(PhoneNumber o) {
        return PHONE_NUMBER_COMPARATOR.compare(this, o);
    }

    public static PhoneNumber of(int areaCode, int prefix, int lineNum) {
        PhoneNumber pn = new PhoneNumber();
        pn.areaCode = areaCode;
        pn.prefix = prefix;
        pn.lineNum = lineNum;
        return pn;
    }
}
