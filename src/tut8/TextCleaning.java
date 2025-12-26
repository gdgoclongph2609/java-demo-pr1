package tut8;
public class TextCleaning {

    public static String cleanText(String content) {
        content = content.toLowerCase();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < content.length(); i++) {
            char c = content.charAt(i);

            if (Character.isLetterOrDigit(c) || c == ' ') {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
