package sda.prog1_10.serialization;

import java.io.*;

public class DeserializationTest {

    public static void main(String[] args) {
        Person person = null;

        try {
            FileInputStream file = new FileInputStream("PersonSerialized.data");
            ObjectInputStream ois = new ObjectInputStream(file);
            person =(Person) ois.readObject();
            ois.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
