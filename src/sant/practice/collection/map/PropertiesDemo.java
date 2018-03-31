package sant.practice.collection.map;

import java.io.*;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("/home/dashsan/exercise/HeadFirstDesignPatterns/src/sant/practice/collection/map/myprop.properties"));
        System.out.println(properties.getProperty("key1"));
        properties.setProperty("key1", "newval");
        properties.setProperty("Unused", "UnVal");

        properties.store(new FileOutputStream("/home/dashsan/exercise/HeadFirstDesignPatterns/src/sant/practice/collection/map/myprop.properties"), "Modified by Santosh");
    }
}
