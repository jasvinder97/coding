package Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class EighteenthJune {


    /*
    String[] strings = input.split(" ");
int n = strings.size();
StringBuilder sb = new StringBuilder();
for(int i =n-1; i>=0;i--){
String s = strings[i];
if(s.matches([a-zA-Z0-9]) || s.isAlphaNumeric()){
String reversed = "";
for(int j=s.size-1;i>=0;j--){
    reversed = reversed + s.charAt(i);
}

sb.append(reversed).append(" ");
}else{

sb.append(s).append(" ");
}
return sb.getString().trim();
}

    * */

    public static void main(String[] args) {
//        System.out.println(reverseString("The sky1 is blue"));
        int[] a = {1, 1, 4, 5, 6, 9};
        integersQuestion(a).stream().forEach(System.out::println);
    }

    static List<Integer> integersQuestion(int[] a) {
        int n = a.length;
        HashSet<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            max = Math.max(a[i], max);
            min = Math.min(a[i], min);
            if (set.contains(a[i])) {
                System.out.println("Duplicate : " + a[i]);
            } else
                set.add(a[i]);
        }
        System.out.println("Min" + min);
        System.out.println("Max" + max);
        List<Integer> missingNumbers = new ArrayList<>();
        while (min < max) {
            int i = min + 1;
            int j = max - 1;
            if (!set.contains(i)) {
                missingNumbers.add(i);

            }
            if (!set.contains(j)) {
                missingNumbers.add(j);

            }
            min++;
            max--;
        }
        return missingNumbers;
    }

    static String reverseString(String input) {
        String[] strings = input.split(" ");
        int n = strings.length;
        StringBuilder sb = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            String s = strings[i];
            if (48 < s.charAt(s.length() - 1) && s.charAt(s.length() - 1) <= 59) {
                String reversed = "";
                for (int j = s.length() - 1; j >= 0; j--) {
                    reversed = reversed + s.charAt(j);
                }
                sb.append(reversed).append(" ");
            } else {
                sb.append(s).append(" ");
            }
        }
        return sb.toString();
    }

//    x[] = {1,1,3,5,6,8,1,9}
//    x[] = {1,2,3,4,5,6,8,7,9}

//    {2,5,9,12}
// 3,4,6,7,8,10,11


    /*
select * from employee where salary =
(select salary from (select count(*),salary,row_num as n from employee group by salary order by salary desc) where n = 5 )
    * */

}