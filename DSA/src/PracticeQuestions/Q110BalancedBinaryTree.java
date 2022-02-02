package PracticeQuestions;

import java.util.*;

public class Q110BalancedBinaryTree {
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
    public boolean isBalanced(TreeNode root) {
        int level=0;
        int min=0;
        int size=0;
        if(root==null)
            return true;

        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        level++ ;
        size++ ;
        if ((root.left!=null && root.right==null) || (root.left==null && root.right!=null))
            min=level;
        while(!q.isEmpty()){
            if(size==0){
                size=q.size();
                level=level+1;
            }
            TreeNode temp=q.remove();
            size=size-1;
            if (temp.left==null&&temp.right==null){
                if(min==0)
                    min=level;
                else if (min>level)
                    min=level;
            }
            if(temp.left!=null)
                q.add(temp.left);
            if(temp.right!=null)
                q.add(temp.right);

        }
        if (level-min>1)
            return false;

        else
            return true;


    }
}
