package tut8;

public class testcleantext {
    public static void main(String[] args) {
        String original = "Roses are red. Violets are blue, Sugar is sweet... And so are you.";

        String cleaned = TextCleaning.cleanText(original);

        System.out.println("Original: " + original);
        System.out.println("Cleaned: " + cleaned);
    }
}
