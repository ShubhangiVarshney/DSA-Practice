package PracticeQuestions;

import java.util.HashMap;

public class Q168ExcelSheet {
    public String convertToTitle(int columnNumber) {
        char ch = 'A';
        int rem;
        String result = "";
        HashMap<Integer, Character> hm = new HashMap<Integer, Character>();
        for (int i = 1; i <= 26; i++) {
            hm.put(i, ch);
            ch++;
        }
        while (columnNumber > 0) {
            rem = columnNumber % 26;
            if (rem == 0) {
                rem = 26;
                columnNumber--;
//                if (columnNumber == 26)
//                    columnNumber = 0;

            }
            columnNumber = columnNumber / 26;
            System.out.println("REM : " + rem + " Col: " + columnNumber);
            result = hm.get(rem) + result;
        }
        return result;
    }

    public static void main(String[] args) {
        Q168ExcelSheet es = new Q168ExcelSheet();
        String res = es.convertToTitle(701);
        System.out.println(res); //ZY

        String res3 = es.convertToTitle(1024);
        System.out.println(res3); //AMJ

        String res1 = es.convertToTitle(52);
        System.out.println(res1); //AZ
    }
}
