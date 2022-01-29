package PracticeQuestions;

public class Q88MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m = m - 1;
        n = n - 1;
        int index = nums1.length - 1;

        while (index >= 0) {
            if (n < 0) {
                nums1[index] = nums1[m];
                m--;
            } else if (m < 0) {
                nums1[index] = nums2[n];
                n--;
            } else {
                if (nums1[m] < nums2[n]) {
                    nums1[index] = nums2[n];
                    n--;
                } else if (nums1[m] >= nums2[n]) {
                    nums1[index] = nums1[m];
                    m--;
                }
            }
            System.out.println(nums1[index]);
            index--;

        }
    }

    public static void main(String[] args) {
        int[] nums1 = {};
        int[] nums2 = {1};
        int m = 0, n = 1;
        Q88MergeSortedArray msa = new Q88MergeSortedArray();
        msa.merge(nums1, 3, nums2, 3);
    }
}
