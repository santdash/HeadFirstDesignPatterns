package sant.serialization.custom;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable {
    private String userName;
    private transient String password;

    public Account(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        System.out.println("Custom de-serialization...");
        ois.defaultReadObject();
        String epwd = (String) ois.readObject();
        password = epwd.substring(3);
    }

    private void writeObject(ObjectOutputStream oos) throws IOException {
        System.out.println("Custom serialization...");
        oos.defaultWriteObject();
        String epwd = "123" + password;
        oos.writeObject(epwd);
    }
}
