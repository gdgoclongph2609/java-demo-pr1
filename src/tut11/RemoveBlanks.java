package tut11;
import java.util.*;
import java.io.*;

public class RemoveBlanks {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (!line.trim().isEmpty()) {
                pw.println(line);
            }
        }

        sc.close();
        pw.close();
    }
}
