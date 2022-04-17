package PracticeQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class Q235LCA {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null){
            return null;
        }
        TreeNode head=root;
        if (p.val==head.val || q.val==head.val){
           return head;
        }
        Queue<TreeNode> q1=new LinkedList<>();
        q1.add(head);
        while(!q1.isEmpty()){
            TreeNode temp=q1.remove();
            if (temp.val>p.val && temp.val<q.val){
                return temp;
            }
            if (temp.left!=null){
                q1.add(temp.left);
            if (temp.right!=null){
                q1.add(temp.right);
            }

            }
        }
        return null;
    }
}
