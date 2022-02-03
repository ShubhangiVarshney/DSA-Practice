package PracticeQuestions;

import java.util.Stack;

public class Q112PathSum {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;

        int sum = 0;
        sum = sum + root.val;
        return sumPath(root.left, targetSum, sum) || sumPath(root.right, targetSum, sum);
    }

    public boolean sumPath(TreeNode root, int targetSum, int sum) {

    }
}
