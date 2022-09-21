package ValidParentheses;

import java.util.*;

public class program {

    public  static int verify(String text)
    {
        char[] chars = text.toCharArray();
        Stack<Character> parenthesesStack = new Stack<>();
        for (char aChar : chars) {
            if (aChar == '<' || aChar == '(' || aChar == '[') {
                parenthesesStack.add(aChar);

            } else if (aChar == '>' || aChar == ')' || aChar == ']') {
                switch (aChar) {
                    case ')':
                        if (parenthesesStack.pop() != '(') return 1;
                        break;
                    case ']':
                        if (parenthesesStack.pop() != '[') return 1;
                        break;
                    case '>':
                        if (parenthesesStack.pop() != '<') return 1;
                        break;
                }
            }
        }

        return  parenthesesStack.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(verify("---(++++)---"));

    }
}
