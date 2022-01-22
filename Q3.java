package PracticeQuestions;

import java.util.*;

public class Q3 {
    public int romanToInt(String s) {
        int num = 0;
        ArrayList<String> al = new ArrayList<>();
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("I", 1);
        hm.put("V", 5);
        hm.put("X", 10);
        hm.put("L", 50);
        hm.put("C", 100);
        hm.put("D", 500);
        hm.put("M", 1000);
        hm.put("IV", 4);
        hm.put("IX", 9);
        hm.put("XL", 40);
        hm.put("XC", 90);
        hm.put("CD", 400);
        hm.put("CM", 900);

        char[] ch_s = s.toCharArray();
        for (int i = 0; i < ch_s.length; i++) {

            if (ch_s[i] == 'C' && i != ch_s.length - 1 && ch_s[i + 1] == 'M') {
                al.add("CM");
                i++;
            } else if (ch_s[i] == 'C' && i != ch_s.length - 1 && ch_s[i + 1] == 'D') {
                al.add("CD");
                i++;
            } else if (ch_s[i] == 'X' && i != ch_s.length - 1 && ch_s[i + 1] == 'C') {
                al.add("XC");
                i++;
            } else if (ch_s[i] == 'X' && i != ch_s.length - 1 && ch_s[i + 1] == 'L') {
                al.add("XL");
                i++;
            } else if (ch_s[i] == 'I' && i != ch_s.length - 1 && ch_s[i + 1] == 'X') {
                al.add("IX");
                i++;
            } else if (ch_s[i] == 'I' && i != ch_s.length - 1 && ch_s[i + 1] == 'V') {
                al.add("IV");
                i++;
            } else {
                al.add(String.valueOf(ch_s[i]));
                System.out.println(String.valueOf(ch_s[i]));
            }
        }


        for (String listElements : al) {
            //System.out.println(al);
            // System.out.println(hm.get(listElements)) ;
            num = num + hm.get(listElements);
        }
        System.out.println(num);
        return num;
    }

    public static void main(String[] args) {
        String s = "MMDCCLVI";
        Q3 obj3 = new Q3();
        int k = obj3.romanToInt(s);
        System.out.println(k);

    }
}
