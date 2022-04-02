package PracticeQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FbQuesMinLength {
    int minLengthSubstring(String s, String t) {
        // Write your code here
        if (t.length() == 0)
            return -1;

        List<Character> substringList = new ArrayList<>();
        for (int i = 0; i < t.length(); i++) {
            substringList.add(t.charAt(i));
        }
        int lastIndex = 0;
        for (int j = 0; j < s.length() && substringList.size() > 0; j++) {
            if (substringList.contains((Character) s.charAt(j))) {
                substringList.remove((Character) s.charAt(j));
            }
            lastIndex++;
        }
        if (substringList.size() > 0)
            return -1;
        else
            return lastIndex;
    }
}

