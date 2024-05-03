package Practice;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {

        int a = 10;
        FunctionalInterface show = (n) -> {
            System.out.println(n++ + a);
        };
        show.show(5);
    }

    ;

    static boolean string(String s) {
        boolean isValid = true;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
//
            if (s.charAt(i) == '}') {
                if (!stack.contains('{')) {
                    return false;
                } else {
                    stack.push(s.charAt(i));
                }
            }
            if (s.charAt(i) == ')' && !stack.contains('(')) {
                return false;
            } else {
                stack.push(s.charAt(i));
            }
            if (s.charAt(i) == ']' && !stack.contains('[')) {
                return false;
            } else {
                stack.push(s.charAt(i));
            }
        }

        for (int i = 0; i < stack.size(); i++) {
            switch (stack.pop()) {
                case '{':
                    if (stack.contains('}')) {
                        break;
                    } else {
                        isValid = false;
                    }
                case '[':
                    if (stack.contains(']')) {
                        break;
                    } else {
                        isValid = false;
                    }
                case '(':
                    if (stack.contains(')')) {
                        break;
                    } else {
                        isValid = false;
                    }
                default:
                    continue;
            }
        }

//        stack.forEach(character -> {

//        });

        return isValid;
    }
}
