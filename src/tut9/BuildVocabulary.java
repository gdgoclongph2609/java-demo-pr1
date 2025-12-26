package tut9;
import java.io.File;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.io.FileNotFoundException;


public class BuildVocabulary {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("text.txt");
        Scanner sc = new Scanner(file);
        Set<String> vocabulary = new HashSet<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            line = line.toLowerCase();

            String[] words = line.split("\\W+");

            for (String word : words) {
                if (!word.isEmpty()) {
                    vocabulary.add(word);
                }
            }



        }
        System.out.println(vocabulary);




    }
}
