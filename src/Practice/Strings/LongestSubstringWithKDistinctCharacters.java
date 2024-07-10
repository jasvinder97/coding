package Practice.Strings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithKDistinctCharacters {

    public static void main(String[] args) {
        System.out.println(logic("eceba", 3));
    }

    static Integer logic(String s, int k) {
        int left = 0;
        int right = 0;
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        while (right < n) {
            char rightChar = s.charAt(right);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);
            right++;
            while (map.size() > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left );
        }
        return maxLength;
    }
}
