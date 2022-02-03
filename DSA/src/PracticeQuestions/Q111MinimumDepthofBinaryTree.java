package PracticeQuestions;

import java.util.*;

public class Q111MinimumDepthofBinaryTree {
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
    public int minDepth(TreeNode root) {
        int size=0;
        int level=0;
        int min=0;
        if (root==null)
            return 0;

        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        size=q.size();
        level++;
        while(!q.isEmpty()){
            if(size==0){
                size=q.size();
                level=level+1;
            }
            TreeNode temp=q.remove();
            size=size-1;
            if( temp.left==null&&temp.right==null){
                if (min==0)
                    min=level;
                else if(min>level)
                    min=level;
            }
            if(temp.left!=null)
                q.add(temp.left);
            if(temp.right!=null)
                q.add(temp.right);

        }
        return min;
    }


}
