package Practice.Strings;

import java.util.Stack;

public class ValidateBrackets {
    public static void main(String[] args) {
        System.out.println(areBracketsBalanced("())"));
    }

    static boolean areBracketsBalanced(String expr) {
        Stack<Character> stack
                = new Stack<>();
        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);

            if (x == '(' || x == '[' || x == '{') {
                // Push the element in the stack
                stack.push(x);
                continue;
            }
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;
                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }
        System.out.println();
        return (stack.isEmpty());
    }

}
