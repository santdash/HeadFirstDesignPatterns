package sant.reflection;

import sant.interview.Triad;

import java.awt.*;

public class GettingClassDemoI {
    public static void main(String[] args) {
        classesCompileTime(String.class);
        classesCompileTime(Color.class);
        classesCompileTime(String[].class);
        lineBreak();
        getClassFromObj(new Triad());
        getClassFromObj(new String());
        getClassFromObj(new String[5]);
        lineBreak();

        try {
            getClassUsingForName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

    private static void getClassUsingForName(String className) throws ClassNotFoundException {
        Class<?> clazz = Class.forName(className);
        System.out.println(clazz.getName() + "\t\t:\t" + clazz.getSimpleName() + "\t:\t" + clazz.getCanonicalName());
    }


    public static void classesCompileTime(Class<?> clazz){
        System.out.println("getName()\t\t:\tgetSimpleName()\t:\tgetCanonicalName()");
        System.out.println("====================================================");
        System.out.println(clazz.getName() + "\t\t:\t" + clazz.getSimpleName() + "\t:\t" + clazz.getCanonicalName());
        System.out.println("-----------------------------------------------------");

    }

    private static <T extends Object> void getClassFromObj(T obj){
        Class<?> clazz = obj.getClass();
        System.out.println(clazz.getName() + "\t\t:\t" + clazz.getSimpleName() + "\t:\t" + clazz.getCanonicalName());
    }

    private static void lineBreak(){
        System.out.println("\n---------------------------------------------------");
    }
}
