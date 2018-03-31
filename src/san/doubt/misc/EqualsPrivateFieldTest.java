package san.doubt.misc;

public class EqualsPrivateFieldTest {
    public static void main(String[] args) {
        EqualsPrivateField ep1 = new EqualsPrivateField();
        EqualsPrivateField ep2 = new EqualsPrivateField();
        System.out.println(ep1.equals(ep2));
    }
}
