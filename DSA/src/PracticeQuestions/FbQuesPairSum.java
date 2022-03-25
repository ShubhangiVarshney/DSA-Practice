package PracticeQuestions;


import java.io.*;
import java.util.*;
// Add any extra import statements you may need here


class Main {

    // Add any helper functions you may need here


    int numberOfWays(int[] arr, int k) {
        // Write your code here
        int numberOfPairs = 0;
        int numberOfPairsUnique = 0;
        int numberOfPairsSame = 0;
        int sameValueCount = 0;
        HashMap<Integer, Integer> elementsMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (elementsMap.containsKey(arr[i])) {
                elementsMap.put(arr[i], elementsMap.get(arr[i]) + 1);
            } else {
                elementsMap.put(arr[i], 1);
            }
        }

        for (int j = 0; j < arr.length; j++) {
            int val = k - arr[j];
            if ((k % 2 == 0 && arr[j] != k / 2) || k % 2 != 0) {
                if (elementsMap.containsKey(val)) {
                    numberOfPairsUnique = numberOfPairsUnique + elementsMap.get(val);
                }
            } else if ((k % 2 == 0 && arr[j] == k / 2)) {
                sameValueCount = elementsMap.get(val);
                if (sameValueCount > 1) {
                    numberOfPairsSame = numberOfPairsSame + factorial(sameValueCount) / ((factorial(sameValueCount - 2)) * 2);
                }
            }
        }
        numberOfPairs = (numberOfPairsUnique / 2) + (numberOfPairsSame / sameValueCount);
        return numberOfPairs;
    }

    static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }


    // These are the tests we use to determine if the solution is correct.
    // You can add your own at the bottom.
    int test_case_number = 1;

    void check(int expected, int output) {
        boolean result = (expected == output);
        char rightTick = '\u2713';
        char wrongTick = '\u2717';
        if (result) {
            System.out.println(rightTick + " Test #" + test_case_number);
        } else {
            System.out.print(wrongTick + " Test #" + test_case_number + ": Expected ");
            printInteger(expected);
            System.out.print(" Your output: ");
            printInteger(output);
            System.out.println();
        }
        test_case_number++;
    }

    void printInteger(int n) {
        System.out.print("[" + n + "]");
    }

    public void run() {
        int k_1 = 6;
        int[] arr_1 = {1, 2, 3, 4, 3};
        int expected_1 = 2;
        int output_1 = numberOfWays(arr_1, k_1);
        check(expected_1, output_1);

        int k_2 = 6;
        int[] arr_2 = {1, 5, 3, 3, 3};
        int expected_2 = 4;
        int output_2 = numberOfWays(arr_2, k_2);
        check(expected_2, output_2);

        // Add your own test cases here

    }

    public static void main(String[] args) {
        new Main().run();
    }
}

