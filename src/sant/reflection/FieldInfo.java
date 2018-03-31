package sant.reflection;

import java.lang.reflect.Field;

public class FieldInfo {
    public static void main(String[] args) {
        Class<?> attr = ExtendedAttribute.class;
        // Finding public fields, same class and inherited.
        findingAPublicField(attr, "attrString"); // This is from parent class.
        findAllPublicFields(attr);

        // Find any/all fields, only from same class.

        findAnyField(attr, "extNumber");
        findAnyField(attr, "attrString"); // This field is from parent class, so result an error.

        findAllFields(attr);
    }

    private static void findAllFields(Class<?> attr) {
        System.out.println("INFO: Getting all fields for class: " + attr);

        Field[] fields = attr.getDeclaredFields();
        for (Field field: fields){
            System.out.println(field + ": "+ field.getDeclaringClass());
        }
    }

    private static void findAnyField(Class<?> attr, String extNumber) {
        System.out.println("INFO: Finding field with any accessor: " + extNumber);
        try {
            Field field = attr.getDeclaredField(extNumber);
            System.out.println(field);
        } catch (NoSuchFieldException e) {
            System.out.println("ERROR: Field: " + extNumber + " not found in class: "+ attr);
        }
    }

    private static void findingAPublicField(Class<?> attr,String fieldName) {
        try {
            Field pField = attr.getField(fieldName);
            System.out.println(pField);
        } catch (NoSuchFieldException e) {
            System.err.println("ERROR: Public Field " + fieldName + " not found in class " + attr.getName());
        }
    }

    private static void findAllPublicFields(Class<?> clazz){
        System.out.println("INFO: Getting all public fields for Class: " + clazz);
        Field[] fields = clazz.getFields();
        for (Field field: fields){
            System.out.println(field + ": " + field.getDeclaringClass() +" : " + field.getType());
        }
    }
}

class Attribute
{
    private String name = "SAttribute";
    public String attrString = "AttrString";
    protected int number = 35;
    public static int staticInt = 20;
    String defString = "DefaultString";
}

class ExtendedAttribute extends Attribute
{
    public String extendName = "ExtendName";
    private Integer extNumber = 60;
    public static int extStaticInt = 34;
    String extDefString = "ExtendedDefString";
}
