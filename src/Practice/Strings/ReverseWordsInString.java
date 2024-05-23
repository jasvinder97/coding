package Practice.Strings;

public class ReverseWordsInString {

    public static void main(String[] args) {
        System.out.println(reverse("I Am Jasvinder"));
    }

    static String reverse(String s) {
        String ans = "";
        String temp = "";
        int i = 0, j = s.length() - 1;
        while (i <= j) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                temp = temp + ch;
            } else if (ch == ' ') {
                if (ans == "") {
                    ans = temp;
                } else {
                    ans = temp + " " + ans;
                }
                temp = "";
            }
            i++;
        }

        if (!temp.equals("")) {
            if (!ans.equals("")) {
                ans = temp + " " + ans;
            } else {
                ans = temp;
            }
        }

        return ans;
    }

}
