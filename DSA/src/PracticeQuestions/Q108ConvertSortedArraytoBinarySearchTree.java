package PracticeQuestions;

public class Q108ConvertSortedArraytoBinarySearchTree {
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
    public TreeNode sortedArrayToBST(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        return arrayToBST( nums, start, end);
    }

    public TreeNode arrayToBST(int[] nums,int start,int end){
          int mid= (start+end)/2;
          TreeNode root=new TreeNode(mid);
          root.left= arrayToBST(nums, start,mid-1);
          root.right= arrayToBST(nums,mid+1,end);
          return root;

    }
}
