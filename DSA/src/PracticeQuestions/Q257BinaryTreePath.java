package PracticeQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q257BinaryTreePath {
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

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root == null) {
            return paths;
        }
        dfs(root, "", paths);
        return paths;
    }

    public void dfs(TreeNode node, String current_path, List<String> paths) {
        current_path = current_path + node.val;
        if (node.left == null && node.right ==null) {
            paths.add(current_path);
            return;
        }
        if (node.left != null) {
            dfs(node.left, current_path + "->", paths);
        }
        if (node.right != null) {
            dfs(node.right, current_path + "->", paths);
        }
    }

}
