package tut9;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;


public class EngVieDictionary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map <String , String > dictionary = new HashMap<>();


        dictionary.put("hello", " xin chao");
        dictionary.put("student", " hoc sinh");
        dictionary.put("apple", " qua tao");
        dictionary.put("tomato", " qua ca chua");

        int choice;
        do {
            System.out.println("Enter an English word: ");
            String word = sc.nextLine();
            word = word.toLowerCase();
            if (dictionary.containsKey(word)) {
                String meaning = dictionary.get(word);
                System.out.println("Meaning: " + meaning);

            } else {
                System.out.println("Meaning not found");



            }
            System.out.println("Do you want to look up another word?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            choice = sc.nextInt();
            sc.nextLine();


        } while (choice == 1);
        System.out.println("goodbye!");






    }

}
