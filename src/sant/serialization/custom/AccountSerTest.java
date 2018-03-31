package sant.serialization.custom;

import java.io.*;

public class AccountSerTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Account account = new Account("dashsan", "helloworld");
        // Serialize
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("account.ser"));
        oos.writeObject(account);

        // Deserialize
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("account.ser"));
        Account dAccount = (Account) ois.readObject();
        System.out.println(dAccount.getUserName()+ " " + dAccount.getPassword());
    }
}
