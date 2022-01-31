package PracticeQuestions;

import java.util.*;

public class Q100SameTree {
    public static class TreeNode {
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
       if (p==null && q==null)
           return true;
       if (p==null || q==null)
           return false;
       if(p.val!=q.val)
           return false;

       return isSameTree(p.right,q.right) &&
               isSameTree(p.left,q.left);

    }
    public boolean isSameTreeIterative(TreeNode p, TreeNode q) {
        if(p==null&&q==null)
            return true;
        Queue<TreeNode> q1=new LinkedList<TreeNode>();
        Queue<TreeNode> q2=new LinkedList<TreeNode>();
        q1.add(p);
        q2.add(q);
        while(!q1.isEmpty()||!q2.isEmpty()){
            TreeNode temp1=q1.remove();
            TreeNode temp2=q2.remove();
            if((temp1!=null&&temp2==null)||(temp1==null&&temp2!=null))
                return false;
            if(temp1!=null&&temp2!=null){
                if(temp1.val!=temp2.val)
                return false;

                q1.add(temp1.left);
                q2.add(temp2.left);
                q1.add(temp1.right);
                q2.add(temp2.right);
            }
        }

        return true;
    }


}


