import java.util.Stack;

public class Test {
    public static void main(String[] args) {
/*        List<Integer> list = List.of(21, 3, 88, 4, 15, 76);
        list.stream().sorted((o1, o2) -> {
            if (o1 > o2) {
                return 1;
            } else
                return -1;
        }).collect(Collectors.toList()).forEach(integer -> System.out.println(integer));*/

        System.out.println(string("{))}"));
    }

//    {()}
//    {[()]}
//    {))}
//

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
