package Practice.Strings.practice;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(removeDuplicateCharacters("jassi4"));
    }

    static String reverse(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }

    static String replaceSpecialCharacters(String s) {
        return s = s.replaceAll("[^a-zA-Z0-9]", "");
    }

    static String removeDuplicateCharacters(String s) {
        StringBuilder stringBuilder = new StringBuilder();

        s.chars().distinct().forEach(stringBuilder::append);
        return stringBuilder.toString();
    }
}
