package PracticeQuestions;
import java.util.*;

public class Q94BTInOrderTraversal {
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<Integer>();
        TreeNode temp=root;

        if (temp==null)
            return list;

        Stack<TreeNode> stk=new Stack<TreeNode>();

        while(!stk.isEmpty()||temp!=null){
            if(temp!=null) {
                stk.push(temp);
                temp = temp.left;

            }
            else {
                temp=stk.pop();
                list.add(temp.val);
                temp=temp.right;
            }
        }
        return list;
    }

    public static void main(String[] args){
        Q94BTInOrderTraversal inorder=new Q94BTInOrderTraversal();




    }
}
