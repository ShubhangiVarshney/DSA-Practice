package PracticeQuestions;

import java.util.*;

public class Q144BinaryPreOrder {
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

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        preorderTraversal(root,list);
        return list;
    }

    public void preorderTraversal(TreeNode root, List<Integer> list) {
        if (root == null)
            return;
        list.add(root.val);
        preorderTraversal(root.left,list);
        preorderTraversal(root.right,list);
    }

}
