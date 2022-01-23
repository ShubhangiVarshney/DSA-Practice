package PracticeQuestions;

import java.util.Stack;
import java.util.*;

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
