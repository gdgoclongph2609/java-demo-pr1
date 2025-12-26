package tut4;
import java.util.*;

public class ArrayPhoneBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names  = {"Michael Myers", "Ash Williams"};
        String[] phones = {" 333-8000", " 333-2323"};

        System.out.println("Enter name to look up: ");
        String input = sc.nextLine();

        String inputLower = input.toLowerCase();
        boolean found = false;
        for (int i = 0; i <= names.length ; i++) {

            String nameLower = names[i].toLowerCase();

            if (nameLower.contains(inputLower)) {
                System.out.println("A result is found for \"" + names[i] + "\".");
                System.out.println("The phone number is: " + phones[i]);
                found = true;
            }

        }
        if (!found) {
            System.out.println("The phone number is not found.");
        }

    }
}
