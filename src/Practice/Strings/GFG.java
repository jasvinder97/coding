package Practice.Strings;

/*package whatever //do not write package name here */

class GFG {
/*
    public static int countVowelSubstrings(String word) {
        int n = word.length();

        int[] arr = new int[26];
        int i = 0;
        int j = 0;
        int count = 0;
        int ans = 0;
        while (j < n) {
            char ch = word.charAt(j);
            if (checkVowel(ch)) {
                if (arr[ch - 'a'] == 0) {
                    count++;
                }
                arr[ch - 'a']++;

                if (count == 5) {
                    int val = i;
                    int[] temp = new int[26];
                    temp['a' - 'a'] = arr['a' - 'a'];
                    temp['e' - 'a'] = arr['e' - 'a'];
                    temp['i' - 'a'] = arr['i' - 'a'];
                    temp['o' - 'a'] = arr['o' - 'a'];
                    temp['u' - 'a'] = arr['u' - 'a'];

                    while (count == 5) {
                        ans++;

                        char c = word.charAt(val);
                        temp--;
                        if (temp == 0) {
                            count--;
                        }
                        val++;
                    }
                    count = 5;
                }
            } else {
                i = j + 1;
                count = 0;
                arr = new int[26];
            }

            j++;
        }

        return ans;
    }
*/

    public static boolean checkVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "aeouisddaaeeiouua";

//        System.out.println(countVowelSubstrings(s));
    }
}

// This code is contributed by vishalkumarsahu04
