package Practice.coding;

import java.util.List;

public class UtopianTree {
    public static void main(String[] args) {

        // Create a List of Practice.Strings
        List<String> stringList = List.of("One", "Two", "Three");

        // Convert the List to a String array
        String[] stringArray = stringList.toArray(new String[0]);

        // Print the elements of the String array
        for (String str : stringArray) {
            System.out.println(str);

        }


    }

    /*
    0   ---   1
    1   ---   2
    2   ---   3
    3   ---   6
    4   ---   7

    */

    public static int heightoftree(int cycles) {
        /*int rem = (cycles) % 2;
        int year = cycles / 2;
        int output = 1;
        output = (int) (Math.pow(2, year + 1) - 1);
        if (rem == 1) output = output + 1;
        return output;*/
        /*int output = 1;
        output = (int) Math.pow(2, (cycles / 2) + 1) - 1;

        return output;*/

        if (cycles % 2 == 0) {
            System.out.println((int) (Math.pow(2, cycles / 2) * 2) - 1);
        } else {
            System.out.println((int) ((Math.pow(2, (cycles - 1) / 2) * 2) - 1) * 2);
        }
        return 0;
    }
}