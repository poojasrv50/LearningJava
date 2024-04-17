import java.util.ArrayList;
import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {
        System.out.println(validParantheses("({[)"));
    }

    public static boolean validParantheses(String s) {
        char[] charArray = s.toCharArray();
        Stack<Character> test = new Stack<>();

        if (charArray.length % 2 == 0) {


            for (char c : charArray) {

                if (test.isEmpty()) {
                    test.push(c);
                } else {
                    if ((test.peek() == '{' && c == '}') || (test.peek() == '(' && c == ')') || (test.peek() == '[' && c == ']')) {
                        test.pop();
                    }
                    else
                        test.push(c);
                }
            }
            return test.isEmpty();

        } else
            return false;


    }
}
