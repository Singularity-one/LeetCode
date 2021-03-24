import java.util.Stack;

/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Input: "()"
Output: true

Input: "()[]{}"
Output: true

Input: "(]"
Output: false

Input: "([)]"
Output: false

Input: "{[]}"
Output: true

*/

public class e20_Valid_Parentheses {

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
	    for (int i = 0; i < s.length(); i++) {
	        char ch = s.charAt(i);
	        // 如果是左括號，則入棧
	        if (ch == '(' || ch == '[' || ch == '{') {
	            stack.push(ch);
	        } else { // 如果是右括號，則比較其與棧頂元素是否配對
	            if (stack.isEmpty()) {
	                return false;
	            }
	            if (ch == ')' && stack.peek() != '(') {
	                return false;
	            }
	            if (ch == ']' && stack.peek() != '[') {
	                return false;
	            }
	            if (ch == '}' && stack.peek() != '{') {
	                return false;
	            }
	            stack.pop();
	        }
	    }
	    // 最後棧為空則表示完全匹配完畢
	    return stack.isEmpty();
    }
}
