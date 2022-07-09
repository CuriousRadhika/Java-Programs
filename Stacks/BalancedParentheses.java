import java.util.Stack;

import javax.lang.model.util.ElementScanner14;

import java.util.Scanner;

public class BalancedParentheses {

    public static boolean isBalancedParentheses(String s) {
        Stack<Character> stack = new Stack<Character>();
        boolean balanced = true;

        for (int x = 0; x < s.length(); x++) {
            char c = s.charAt(x);

            if (c == '(' || c == '{' || c == '[')
                stack.push(c);

            if (c == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    balanced = false;
                    break;
                }
            }
            if (c == '}') {
                if (!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                } else {
                    balanced = false;
                    break;
                }
            }
            if (c == ']') {
                if (!stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else {
                    balanced = false;
                    break;
                }
            }
        }

        if (balanced == true && stack.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean isBalancedParentheses_Improved1(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (int x = 0; x < s.length(); x++) {
            char c = s.charAt(x);

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                continue;
            }

            if (stack.isEmpty())
                return false;

            if (c == ')') {
                if (!(stack.pop() == '('))
                    return false;

            } else if (c == '}') {
                if (!(stack.pop() == '{'))
                    return false;
            } else if (c == ']') {
                if (!(stack.pop() == '['))
                    return false;
            }
        }

        return stack.isEmpty();
    }

    public static boolean isBalancedParentheses_Improved2(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (int x = 0; x < s.length(); x++) {
            char c = s.charAt(x);

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);

            }

            else {
                if (stack.isEmpty())
                    return false;

                else if (!isMatching(stack.peek(), c)) {
                    return false;
                } else
                    stack.pop();

            }
        }

        return stack.isEmpty();
    }

    public static boolean isMatching(char a, char b) {
        return (a == '(' && b == ')' || a == '[' && b == ']' || a == '{' && b == '}');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // System.out.println(isBalancedParentheses(s));
        System.out.println(isBalancedParentheses_Improved2(s));
    }

}
