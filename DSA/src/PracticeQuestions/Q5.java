package PracticeQuestions;
import java.util.Stack;
// Q20- Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//An input string is valid if:
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.


public class Q5 {
    public boolean isValid(String s) {
        char ch;
        Stack<Character> stk=new Stack<Character>();
        for (int i=0; i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
                stk.push(s.charAt(i));
            else {
                if (!stk.isEmpty()) {
                    ch = stk.pop();
                    if (s.charAt(i) == ')' && ch != '(')
                        return false;
                    else if (s.charAt(i) == '}' && ch != '{')
                        return false;
                    else if (s.charAt(i) == ']' && ch != '[')
                        return false;
                }
                else
                    return false;
            }
        }
        if (stk.isEmpty())
            return true;
        else
            return false;
    }

    public static void main(String[] args){
        String s="(){}[[](){}]";
        Q5 obj5=new Q5();
        boolean ans=obj5.isValid(s);
        System.out.println(ans);

    }
}
