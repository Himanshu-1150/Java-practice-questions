
import java.util.Stack;

public class DuplicateParanthesis {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // If current character is a closing parenthesis
            if (ch == ')') {
                int count = 0;
                
                // Pop elements from the stack until you find an opening parenthesis
                while (!s.isEmpty() && s.peek() != '(') {
                    s.pop();
                    count++;
                }
                
                // If there was no meaningful character between the parentheses, it's a duplicate
                if (count == 0) {
                    return true;
                }
                
                // Remove the opening parenthesis from the stack
                s.pop();
            } else {
                // Push all other characters to the stack
                s.push(ch);
            }
        }
        
        // No duplicate parentheses found
        return false;
    }
    
    public static void main(String[] args) {
        String str = "(a+b)";
        System.out.println(isDuplicate(str)); // Output: false
        
        str = "((a+b))";
        System.out.println(isDuplicate(str)); // Output: true
    }
}
