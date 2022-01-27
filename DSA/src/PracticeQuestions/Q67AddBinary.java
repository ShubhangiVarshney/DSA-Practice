package PracticeQuestions;

public class Q67AddBinary {
    public String addBinary(String a, String b) {
        int carry = 0;
        int diff = 0;
        String c = "", d = "", sum = "";
        if (a.length() >= b.length()) {
            diff = a.length() - b.length();
            c = a; //c contains big
            d = b; //d contains small
        } else if (a.length() < b.length()) {
            diff = b.length() - a.length();
            c = b; //c contains big
            d = a; //d contains small
        }

        if (diff > 0) {
            for (int i = 1; i <= diff; i++) {
                d = "0" + d;
            }
        }
        System.out.println("Value of c & d:" + c + "," + d);

        for (int j = c.length() - 1; j >= 0; j--) {
            System.out.println(j);
            System.out.println("character of c & d at jth position:" + c.charAt(j) + "," + d.charAt(j));
            if (c.charAt(j) == 0 && d.charAt(j) == 0) {
                System.out.println("entered condition 1");
                if (carry == 0) {
                    sum = "0" + sum;
                    carry = 0;
                } else {
                    sum = "1" + sum;
                    carry = 0;
                }
            } else if (c.charAt(j) == 0 && d.charAt(j) == 1) {
                System.out.println("entered condition 2");
                if (j == 0) {
                    if (carry == 0) {
                        sum = "1" + sum;
                        carry = 0;
                    } else {
                        sum = "10" + sum;
                        carry = 1;
                    }
                } else {
                    if (carry == 0) {
                        sum = "1" + sum;
                        carry = 0;
                    } else {
                        sum = "0" + sum;
                        carry = 1;
                    }
                }
            } else if (c.charAt(j) == 1 && d.charAt(j) == 0) {
                System.out.println("entered condition 3");
                if (j == 0) {
                    if (carry == 0) {
                        sum = "1" + sum;
                        carry = 0;
                    } else {
                        sum = "10" + sum;
                        carry = 1;
                    }
                } else {
                    if (carry == 0) {
                        sum = "1" + sum;
                        carry = 0;
                    } else {
                        sum = "0" + sum;
                        carry = 1;
                    }
                }
            } else if (c.charAt(j) == 1 && d.charAt(j) == 1) {
                System.out.println("entered condition 4");
                if (j == 0) {
                    if (carry == 0) {
                        sum = "10" + sum;
                        carry = 0;
                    } else {
                        sum = "11" + sum;
                        carry = 1;
                    }
                } else {
                    if (carry == 0) {
                        sum = "0" + sum;
                        carry = 1;
                    } else {
                        sum = "1" + sum;
                        carry = 1;
                    }
                }
            }
        }
        System.out.println("the sum of 2 binary number: " + sum);
        return sum;
    }

    public static void main(String[] args) {
        String a = "11", b = "0";
        Q67AddBinary ab = new Q67AddBinary();
        ab.addBinary(a, b);

    }
}
