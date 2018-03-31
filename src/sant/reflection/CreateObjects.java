package sant.reflection;

import sant.reflection.helper.Animal;
import sant.reflection.helper.Pet;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CreateObjects {
    public static void main(String[] args) {
        try {
            Pet a = createObject("sant.reflection.helper.Pet");
            a.setLifeSpan(5);
            System.out.println(a.getClass().getName());
            System.out.println(a.getLifeSpan());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace(System.err);
        }

        try
        {
            Class[] paramTypes = {String.class, int.class};
            Object[] params = {"Lion", 20};
            Animal a = createObject("sant.reflection.helper.Animal", paramTypes, params);
            System.out.println(a.getGeneralName());
        } catch (InstantiationException | NoSuchMethodException | ClassNotFoundException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace(System.err);
        }
    }

    /* Creating the object and casting it using default constructor */
    private static <T> T createObject(String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> clazz = Class.forName(className);
        final Object o = clazz.newInstance();
        return (T) o;
    }

    private static <T> T createObject(String className, Class[] paramTypes, Object[] params ) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> clazz = Class.forName(className);
        Constructor constructor = clazz.getDeclaredConstructor(paramTypes);
        return (T) constructor.newInstance(params);
    }
}
