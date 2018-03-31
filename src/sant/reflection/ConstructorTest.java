package sant.reflection;

import java.lang.reflect.Constructor;

public class ConstructorTest {
    public static void main(String[] args) throws NoSuchMethodException {
        findAllPublicConstructors(ExtendedThing.class);
        // Find a Specific public constructor, this throws NoSuchMethodException
        Class<?> clazz = ExtendedThing.class;
        Constructor constructor = clazz.getConstructor(int.class, String.class);
        System.out.println(constructor);

        finalAllConstructors(clazz);

        // Find any constructor with any visibility in the class.
        Constructor constructor1 = clazz.getDeclaredConstructor(Integer.class, String.class);
        System.out.println(constructor1);

        Constructor constructor2 = clazz.getDeclaredConstructor();
        System.out.println(constructor2);

    }

    private static void finalAllConstructors(Class<?> clazz) {
        System.out.println("\tINFO: Finding all constructors of class: " + clazz);
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor: constructors){
            System.out.println(constructor);
        }
    }

    private static void findAllPublicConstructors(Class<?> clazz){ // Only same class.
        Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor constructor: constructors){
            System.out.println(constructor);
        }
    }


}

class Thing{
    public Thing(int a, String b){

    }

    private Thing(Integer a, String b){
    }
    protected  Thing(){};
}

class ExtendedThing extends Thing{
    public ExtendedThing(int a, String b){

    }

    private ExtendedThing(Integer a, String b){
    }
    protected  ExtendedThing(){};
}
