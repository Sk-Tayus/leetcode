import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        if(s.length() % 2 != 0) return false;
        for(int i=0; i<=s.length()-1 ; i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            else {
                if(st.isEmpty()) return false;
                if(ch == ')' && st.peek() != '(') return false;
                if(ch == '}' && st.peek() != '{') return false;
                if(ch == ']' && st.peek() != '[') return false;

                st.pop();
            }
        }
        return st.isEmpty();
    }
}