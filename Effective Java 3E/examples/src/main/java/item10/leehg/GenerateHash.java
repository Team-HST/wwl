package item10.leehg;

import java.lang.reflect.Type;
import java.util.Objects;

/**
 * @author dlgusrb0808@gmail.com
 */
public class GenerateHash {

    public static void main(String[] args) {
        CreditCard card = CreditCard.of(100, "100");
        CreditCard otherCard = CreditCard.of(100, "100");

        System.out.println(String.format("card.hashCode(): %d, card.myHashCode(): %d", card.hashCode(), card.myHashCode()));
        System.out.println(String.format("otherCard.hashCode(): %d, otherCard.myHashCode(): %d", otherCard.hashCode(), otherCard.myHashCode()));
    }

    static class CreditCard {
        private int no;
        private String sig;

        public int getNo() {
            return no;
        }

        public String getSig() {
            return sig;
        }

        public static CreditCard of(int no, String sig) {
            CreditCard creditCard = new CreditCard();
            creditCard.no = no;
            creditCard.sig = sig;
            return creditCard;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof CreditCard)) return false;
            CreditCard that = (CreditCard) o;
            return no == that.no &&
                    Objects.equals(sig, that.sig);
        }

        @Override
        public int hashCode() {
            return Objects.hash(no, sig);
        }

        public int myHashCode() {
            int result = Integer.hashCode(no);
            result = 31 * result + sig.hashCode();
            return result;
        }
    }
}
