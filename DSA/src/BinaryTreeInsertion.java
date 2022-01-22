import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeInsertion {
    Node root;
    Node temp=root;

    class Node{
        int data;
        Node left, right;

        Node (int n){
            this.data=n;
            left=right=null;
        }
    }

    void insertElement(Node temp, int key){
       if(temp==null){
           root =new Node(key);
           return;
       }

       Queue<Node> q=new LinkedList();
       q.add(root);
       while(!q.isEmpty()){
         temp=q.poll();
         if (temp.left!=null)
             q.add(temp.left);
         else {
             temp.left = new Node(key);
             break;
         }
         if (temp.right!=null)
             q.add(temp.right);
         else {
             temp.right = new Node(key);
             break;
         }
       }
    }

    void PreOrder(Node root){
        if (root==null)
            return;

        System.out.print(root.data+ " ");

        PreOrder(root.left);

        PreOrder(root.right);

    }

    public static void main (String[] args){
        BinaryTreeInsertion instree=new BinaryTreeInsertion();
        instree.insertElement(instree.root, 12);
        instree.insertElement(instree.root, 1);
        instree.insertElement(instree.root, 5);
        instree.insertElement(instree.root, 7);
        instree.insertElement(instree.root, 87);
        instree.insertElement(instree.root, 99);
        //System.out.println(instree.root.data);
        instree.PreOrder(instree.root);

    }
}
