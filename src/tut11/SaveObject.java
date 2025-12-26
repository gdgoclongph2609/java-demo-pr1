package tut11;
import java.io.*;
import java.util.*;

public class SaveObject {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();

        list.add("My name is Long");
        list.add("Long is my name");
        list.add("Full name is long");

        FileOutputStream fos = new FileOutputStream("data.bin");

        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(list);

        oos.close();
        fos.close();



    }
}
