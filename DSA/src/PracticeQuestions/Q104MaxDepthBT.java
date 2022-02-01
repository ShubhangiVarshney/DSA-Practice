package PracticeQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class Q104MaxDepthBT {
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
    public int maxDepth(TreeNode root) {
    int level=0;
    int size=0;
    if(root==null)
        return 0;

        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        level++;
        size=size+1;
        while(!q.isEmpty()){
            if(size==0){
                size=q.size();
                level=level+1;

            }
            TreeNode temp=q.remove();
            size=size-1;

            if(temp.left!=null)
                q.add(temp.left);
            if(temp.right!=null)
                q.add(temp.right);
            }
        return level;
        }

    }

