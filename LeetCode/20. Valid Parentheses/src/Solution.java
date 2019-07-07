import java.util.HashMap;
import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> stringMatch = new HashMap<Character, Character>();
        stringMatch.put(')','(');
        stringMatch.put('}','{');
        stringMatch.put(']','[');
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i ++){
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
                continue;
            }
            if (stack.size() == 0 || stringMatch.get(s.charAt(i)) != stack.pop()) {
                System.out.println("false");
                return false;
            }
        }
        System.out.println(stack.empty());
        return  stack.empty();
    }
}