package Stacks;

import java.util.Stack;
// commmiying prefix to postfix 
public class infixToPostfix {
  public static int priority(char c) {
        if (c == '+' || c == '-') {
            return 1;
        } else if (c == '*' || c == '/') {
            return 2;
        } else if (c == '^') {
            return 3;
        }
        return -1; // for non-operators like '(' or ')'
    }

    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        String s = "a+b*c-d";
        String ans = "";
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            // If the character is an operand, add it to the result
            if (Character.isLetterOrDigit(c)) {
                ans += c;
            }
            // If the character is '(', push it to the stack
            else if (c == '(') {
                st.push(c);
            }
            // If the character is ')', pop and output from the stack
            // until an '(' is encountered
            else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans += st.pop();
                }
                st.pop(); // remove '(' from stack
            }
            // An operator is encountered
            else {
                while (!st.isEmpty() && priority(c) <= priority(st.peek())) {
                    ans += st.pop();
                }
                st.push(c);
            }
        }

        // Pop all the operators from the stack
        while (!st.isEmpty()) {
            ans += st.pop();
        }

        System.out.println("Postfix Expression: " + ans);
    }
}
