
//Iterative traversal of the Binary Tree
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class BinaryTreeTraversalItr {
    Node root;

     static class Node {
        int data;
        Node left, right;

        Node(int n) {
            this.data = n;
            left = right = null;
        }
    }

    void LevelOrder (Node root){
         if (root==null)
             return;

         Node temp=root;
         Queue<Node> q= new LinkedList<Node>();
         q.add(root);
         while(!q.isEmpty()){
            temp=q.remove();
            System.out.print(temp.data);
            if(temp.left!=null)
                q.add(temp.left);
            if(temp.right!=null)
                q.add(temp.right);
         }
    }

    void PreOrder(Node root){
        if(root==null)
            return;

        Stack<Node> s=new Stack<Node>();
        s.push(root);
        while(!s.empty()){
            Node temp=s.pop();
            System.out.print(temp.data);
            if(temp.right!=null)
                s.push(temp.right);
            if(temp.left!=null)
                s.push(temp.left);
        }
    }
    void InOrder(Node root) {
        if (root == null)
            return;

        Stack<Node> s = new Stack<Node>();
        Node temp = root;
        while (!s.empty() || temp != null) {
            if (temp != null) {
                s.push(temp);
                temp = temp.left;
            } else {
                temp=s.pop();
                System.out.print(temp.data);
                temp=temp.right;

            }
        }
    }

    void PostOrder(Node root) {
         if(root==null)
             return;

         Stack<Node> s=new Stack<Node>();
         Node temp=root;

         while (!s.empty()||temp!=null){
           if(temp!=null) {
               s.push(temp);
               temp=temp.left;
           }

           else {
               Node curr = s.peek().right;

               if (curr == null) {
                   curr = s.pop();
                   System.out.print(curr.data);

                   while (!s.empty() && curr == s.peek().right) {
                       curr = s.pop();
                       System.out.print(curr.data);
                       }
               } else
                   temp = curr;
           }
         }

    }


    public static void main(String[] args){
        BinaryTreeTraversalItr tree= new BinaryTreeTraversalItr();
        tree.root=new Node(1);
        tree.root.left=new Node(6);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);
        tree.root.right.right=new Node(2);
        // tree.PreOrder(tree.root);
        //tree.InOrder(tree.root);
        //tree.PostOrder(tree.root);
        tree.LevelOrder(tree.root);
     }
}
