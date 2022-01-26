package PracticeQuestions;

import java.util.Arrays;

public class Q66PlusOne {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int[] newDigits = new int[len+1];
        int l = digits.length - 1;
        int carry = 0;
        System.out.println(len);

        for (int i = l; i >= 0; i--) {
            if (digits[i] == 9) {
                carry = 1;
                digits[i] = 0;
            } else if (digits[i] != 9) {
                digits[i] = digits[i] + 1;
                carry = 0;
                return digits;
            }
        }

        newDigits[0] = carry;

        for (int i = 0; i < len; i++) {
            newDigits[i + 1] = digits[i];
        }

        return newDigits;
    }

    public static void main(String[] args) {
        int[] digits = new int[]{9};
        Q66PlusOne po = new Q66PlusOne();
        po.plusOne(digits);
    }
}
