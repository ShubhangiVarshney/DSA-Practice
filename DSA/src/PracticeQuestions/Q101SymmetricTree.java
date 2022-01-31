package PracticeQuestions;

import java.util.*;

public class Q101SymmetricTree {
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
    public boolean isSymmetricIterative(TreeNode root){
        if (root==null)
            return true;

        Queue<TreeNode> q1=new LinkedList<TreeNode>();
        Queue<TreeNode> q2=new LinkedList<TreeNode>();
        q1.add(root.left);
        q2.add(root.right);

        while(!q1.isEmpty()||!q2.isEmpty()){
            TreeNode temp1=q1.remove();
            TreeNode temp2=q2.remove();
            if((temp1==null&&temp2!=null)||(temp1!=null&&temp2==null))
                return false;
            if(temp1!=null&&temp2!=null)
                if(temp1.val!=temp2.val)
                return false;
            q1.add(temp1.left);
            q1.add(temp1.right);
            q2.add(temp2.right);
            q2.add(temp2.left);
        }
        return true;
    }
}
