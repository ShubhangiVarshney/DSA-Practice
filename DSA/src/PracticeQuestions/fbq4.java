package PracticeQuestions;

import java.util.ArrayList;
import java.util.HashSet;

public class fbq4 {
    public static ArrayList<Integer> getPerfectSquares(int n)
    {
        ArrayList<Integer> perfectSquares = new ArrayList<>();
        int current = 1, i = 1;

        // while current perfect square is less than or equal to n
        while (current <= n) {
            perfectSquares.add(current);
            current = (int)Math.pow(++i, 2);
        }
        return perfectSquares;
    }

    // Function to print the sum of maximum
    // two elements from the array
    public static int maxPairSum(int arr[])
    {
        int n = arr.length;
        int max, secondMax;
        if (arr[0] > arr[1]) {
            max = arr[0];
            secondMax = arr[1];
        }
        else {
            max = arr[1];
            secondMax = arr[0];
        }

        for (int i = 2; i < n; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            else if (arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        return (max + secondMax);
    }

    // Function to return the count of numbers that
    // when added with n give a perfect square
    public static int countPairsWith(
            int n, ArrayList<Integer> perfectSquares,
            HashSet<Integer> nums)
    {
        int count = 0;
        for (int i = 0; i < perfectSquares.size(); i++) {
            int temp = perfectSquares.get(i) - n;

            // temp > n is checked so that pairs
            // (x, y) and (y, x) don't get counted twice
            if (temp > n && nums.contains(temp))
                count++;
        }
        return count;
    }

    // Function to count the pairs whose sum is a perfect square
    public static int countPairs(int arr[])
    {
        int i, n = arr.length;

        // Sum of the maximum two elements from the array
        int max = maxPairSum(arr);

        // List of perfect squares upto max
        ArrayList<Integer> perfectSquares =
                getPerfectSquares(max);

        // Contains all the array elements
        HashSet<Integer> nums = new HashSet<>();
        for (i = 0; i < n; i++)
            nums.add(arr[i]);

        int count = 0;
        for (i = 0; i < n; i++) {

            // Add count of the elements that when
            // added with arr[i] give a perfect square
            count += countPairsWith(arr[i], perfectSquares, nums);
        }
        return count;
    }
    public static void main(String[] args)
    {
        int arr[] = { 2, 3, 6, 9, 10, 20 };

        System.out.println(countPairs(arr));
    }
}
