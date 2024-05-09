package Practice.Strings;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abbba"));
    }

    static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        boolean isPalindrom = true;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                isPalindrom = false;
            }
            i++;
            j--;
        }
        return isPalindrom;
    }
}
