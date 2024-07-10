package Practice.Strings;

public class LongestCommonSubstring {
    public static void main(String[] args) {
        String[] strings = {"geeksforgeeks", "geeks", "geeography"};
        System.out.println(substring(strings));
    }

    static String substring(String[] strings) {
        String str = strings[0];
        for (int i = 0; i < strings.length; i++) {
            while (strings[i].indexOf(str) != 0) {
                str = str.substring(0, str.length() - 1);
            }
        }
        return str;
    }
}
