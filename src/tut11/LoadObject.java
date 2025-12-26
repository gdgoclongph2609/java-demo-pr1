package tut11;
import java.io.*;
import java.util.*;

public class LoadObject {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileInputStream fis = new FileInputStream("data.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Object obj = ois.readObject();
            ArrayList<String> list = (ArrayList<String>) obj;
            for (String s : list){
                System.out.println(s);

            }
            ois.close();
            fis.close();



        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

}
