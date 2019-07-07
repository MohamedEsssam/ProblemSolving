import java.util.Stack;

public class Solution {
        public String removeDuplicates(String S) {
            Stack stack = new Stack<Character>();
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < S.length(); i++) {
                if (!stack.empty() && stack.peek().equals(S.charAt(i)) )stack.pop();
                else stack.push(S.charAt(i));
               }
            while (!stack.empty()){
                builder.append(stack.pop());
            }
            //System.out.println(builder.reverse());
            return String.valueOf(builder.reverse());
            }
        }
