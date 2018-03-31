package sant.serialization.intro;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Create Object.
        SomeSerializableObject object = new SomeSerializableObject(3, 6, 9);
        object.addToList(10);
        object.addToList(20);
        // Serialize
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(object);
        SomeSerializableObject o1 = new SomeSerializableObject(4, 5, 6);

        // DeSerialize
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("abc.ser"));
        SomeSerializableObject object1 = (SomeSerializableObject) objectInputStream.readObject();
        System.out.println(object1.getA() + " " + object1.getB() + " " + object1.getC()); // c being transient not serialized. It saves default value so c is 0.
        System.out.println(object1.getfInt()); // Prints Null
        System.out.println(object1.getSomeVal());
        System.out.println(object1.getD()); // 0, Note: So final variable is not initialized during declaration but done in constructor it won't be initialized.
    }
}
