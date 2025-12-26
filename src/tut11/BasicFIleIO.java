package tut11;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class BasicFIleIO {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("hello.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.println("Hello World");
        pw.close();

        Scanner sc = new Scanner(file);
        String message = sc.nextLine();
        System.out.println(message);




    }
}
