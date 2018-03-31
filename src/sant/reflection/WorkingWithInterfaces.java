package sant.reflection;

import java.lang.reflect.Modifier;
import java.util.List;

public class WorkingWithInterfaces {
    public static void main(String[] args) {
        interfaces(String.class);
        interfaces(List.class);
    }

    private static void interfaces(Class<?> clazz){
        if (clazz.isInterface()) // Check if it's already and interface.
            System.out.println(clazz.getName() + " is an interface");
        Class<?>[] interfaces = clazz.getInterfaces(); // Get the interfaces or the class/interface implements/extends
        for (Class<?> iface: interfaces){
            System.out.println(iface.getName());
            System.out.println("Modifiers: " + Modifier.toString(iface.getModifiers()));
        }
    }
}
