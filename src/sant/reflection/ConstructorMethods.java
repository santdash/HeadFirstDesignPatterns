package sant.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.net.ServerSocket;

public class ConstructorMethods {
    public static void main(String[] args) {
        printConstructorDetails(ServerSocket.class);

    }

    private static void printConstructorDetails(Class clazz) {
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            Class s = constructor.getDeclaringClass();
            //System.out.println(s);
            //System.out.println(Modifier.toString(constructor.getModifiers()));
            //System.out.println(constructor.toString());
            System.out.format("%s ", Modifier.toString(constructor.getModifiers()));
            System.out.format("%s ", constructor.getDeclaringClass().getName());
            System.out.format("( ");
            Class[] classes = constructor.getParameterTypes();
            for (Class param: classes){
                System.out.format("%s ", param.getName());
            }
            System.out.format(") ");
            Class[] exceptions = constructor.getExceptionTypes();
            if (exceptions.length > 0) {
                System.out.format("throws ");
                for (Class exception: exceptions)
                    System.out.format("%s ", exception.getName());
            }
            System.out.println();
            //System.out.println(constructor.toString());
        }
    }
}
