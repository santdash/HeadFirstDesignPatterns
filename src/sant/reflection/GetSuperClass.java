package sant.reflection;

import javax.swing.*;

public class GetSuperClass {
    public static void main(String[] args) {
        hierarchy(JTextArea.class);
    }

    private static void hierarchy(Class<?> clazz) {
        Class<?> superClass = clazz.getSuperclass();
        if (superClass == null) {
            System.out.println(clazz.getName());
            return;
        }
        hierarchy(superClass);
        System.out.println(clazz.getName());

    }
}
