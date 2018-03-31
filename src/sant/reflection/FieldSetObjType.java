package sant.reflection;

import java.lang.reflect.Field;

public class FieldSetObjType {
    public static void main(String[] args) {
        Act a = new Act();
        a.aVal = "AValue";
        a.sVal = "SValue";

        /* Getting and Setting Object type fields */
        Class<?> clazz = a.getClass();
        try {
            Field svalField = clazz.getField("sVal");
            //System.out.println(svalField.getType());
            String sVal = (String) svalField.get(a);
            System.out.println("Before modification: " + sVal);
            svalField.set(a, "ModifiedSValue");
            System.out.println(a.sVal);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        /* Getting and Setting literal fields, with some additional checks which is recommended for above as-well */
        try {
            Field anIntField = clazz.getDeclaredField("anInt");
            if (anIntField.getType().equals(int.class)) {
                int anIntVal = anIntField.getInt(a);
                System.out.println("Retrieved int value from field: " + anIntVal);
                anIntField.setInt(a, 20);
                System.out.println("Int value after modification: " + a.anInt);
            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        /* Getting and setting static fields (Both Object type and literal */
        try {
            Field stInt = clazz.getDeclaredField("staticInt");
            int stIntVal = stInt.getInt(null);
            System.out.println("Static int value: " + stIntVal);
            stInt.setInt(null, 45);
            System.out.println("Static int value after change: " + Act.staticInt);

            Field stString = clazz.getDeclaredField("staticString");
            String s = (String) stString.get(null);
            System.out.println("Static String value: " + s);
            stString.set(null, "NewStaticString");
            System.out.println("Static String value after change: " + Act.staticString);

            /* Try to get static Object with obj */
            String s1 = (String) stString.get(a);
            System.out.println(s1); // Works with object reference as-well.

        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }

        /* Getting and Setting private fields */
        try {
            Field prvtF = clazz.getDeclaredField("prvt");
            if (!prvtF.isAccessible())
                prvtF.setAccessible(true);
            String p = (String) prvtF.get(a);
            System.out.println(p);
            prvtF.set(a, "ModifiedPrivate");
            System.out.println(a.getPrvt());
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace(System.err);
        }


    }

}

class Act {
    public static int staticInt = 2;
    public static String staticString = "StartValue";
    public String sVal;
    public String aVal;
    public int anInt = 5;
    private String prvt = "DefaultPrivate";

    public String getPrvt() {
        return prvt;
    }
}
