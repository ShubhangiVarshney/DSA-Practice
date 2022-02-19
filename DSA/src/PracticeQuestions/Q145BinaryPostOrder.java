package PracticeQuestions;
import java.util.*;

public class Q145BinaryPostOrder {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> list2=new ArrayList<Integer>();
    postOrder(root,list2);
    return list2;

    }

    public void postOrder(TreeNode root, List<Integer> list2){
        if (root==null)
            return;

        postOrder(root.left,list2);
        postOrder(root.right,list2);
        list2.add(root.val);

    }
}
