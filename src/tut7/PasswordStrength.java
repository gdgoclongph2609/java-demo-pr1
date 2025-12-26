package tut7;

import java.util.Scanner;

public class PasswordStrength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        int score = 0;
        int length = password.length();

        if ( length >= 8 && length < 12 ) {
            score += 1;
        } else if (length >= 12 ) {
            score += 2;
        }
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSymbol = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(password.charAt(i))){
                hasUpper = true;
            }
            if (Character.isLowerCase(password.charAt(i))){
                hasLower = true;
            }
            if (Character.isDigit(password.charAt(i))){
                hasDigit = true;
            }
            if (!Character.isLetterOrDigit(password.charAt(i))){
                hasSymbol = true;
            }



        }
        if (hasUpper){
            score++;
        } if (hasLower){
            score++;
        }  if (hasDigit){
            score++;
        }  if (hasSymbol){
            score++;
        }

        String strength = "";
        if (score <= 2) {
            strength = "weak";
        } else if (score <= 4) {
            strength = "medium";

        } else if (score >= 6) {
            strength = "strong";
        }
        System.out.println("Strength: " + score + " (" + strength +  ")");






    }

}
