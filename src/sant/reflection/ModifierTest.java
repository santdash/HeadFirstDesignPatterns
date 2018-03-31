package sant.reflection;

import java.lang.reflect.Modifier;

public class ModifierTest {
    public static void main(String[] args) {
        Class<String> stringClass = String.class;
        examine(stringClass);
    }

    private static void examine(Class<String> stringClass) {
        int mod = stringClass.getModifiers();
        System.out.println("isPublic: " + Modifier.isPublic(mod));
        System.out.println("isPrivate: " + Modifier.isPrivate(mod));
        System.out.println("isFinal: " + Modifier.isFinal(mod));
        System.out.println("toString: " + Modifier.toString(mod));
    }
}
