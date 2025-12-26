import java.util.Scanner;

public class Majors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two characters: ");
        String s = sc.next();

        if (s.length() !=2 ){
            System.out.println("Invalid input");
        }

        s = s.toUpperCase();

        char major =  s.charAt(0);
        char year = s.charAt(1);

         String majorName = "";
         String yearName = "";




        boolean valid = true;

        switch (major) {
            case 'M' : majorName = "Mathematics";
            break;

            case 'C' : majorName = "Computer Science";
            break;

            case 'I' : majorName = "Information Technology";
            break;

            default : valid = false;
        }
        switch (year) {
            case '1' : yearName = "freshman";
            break;

            case '2' : yearName = "sophomore";
            break;

            case '3' : yearName = "junior";
            break;

            case '4' : yearName = "senior";
            break;

            default : valid = false;

        }

        if (!valid){
            System.out.println("Invalid input");

        } else {
            System.out.println(majorName + " " + yearName);
        }


    }
}
