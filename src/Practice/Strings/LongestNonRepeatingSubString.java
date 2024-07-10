package Practice.Strings;

import java.util.HashSet;

public class LongestNonRepeatingSubString {
    public static void main(String[] args) {
        System.out.println(lengthOfNonRepeatingSubString("abcabcaa"));
    }

    static int lengthOfNonRepeatingSubString(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int n = s.length();
        int maxLenght = 0;
        int start = 0;
        for (int right = 0; right < n; right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            /*           maxLenght = Math.max(maxLenght, right - left + 1);*/
            if (right - left + 1 > maxLenght) {
                maxLenght = right - left + 1;
                start = left;
            }
        }
        System.out.println(s.substring(start, start + maxLenght));
        return maxLenght;
    }

}
