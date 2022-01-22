import java.util.Queue;
import java.util.LinkedList;

public class HeightBT {

    private Node root;
    private int max = 0;

    static class Node {
        String data;
        Node left;
        Node right;

        Node(String s) {
            this.data = s;
            left = right = null;
        }
    }
    void LevelTraverse(Node root){
        if (root==null)
            return;

        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp=q.remove();
            System.out.print(temp.data +" ");
            if (temp.left!=null)
                q.add(temp.left);
            if (temp.right!=null)
                q.add(temp.right);

        }

    }

    void insertElement(Node temp, String s) {
        if (root == null) {
            root = new Node(s);
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!s.isEmpty()) {
            temp = q.remove();
            if (temp.left != null)
                q.add(temp.left);
            else {
                temp.left = new Node(s);
                break;
            }
            if (temp.right != null)
                q.add(temp.right);
            else {
                temp.right = new Node(s);
                break;
            }

        }
    }

    void height(Node root, int level) {
        if (root == null)
            return;
        level = level + 1;
        if (this.max < level)
            this.max = level;
        if (root.left != null)
            height(root.left, level);
        if (root.right != null)
            height(root.right, level);

    }


    public static void main(String[] args) {
        HeightBT h= new HeightBT();
        h.insertElement(h.root,"Anna");
        h.insertElement(h.root,"Sow");
        h.insertElement(h.root,"Saby");
        h.insertElement(h.root,"Shubh");
        h.LevelTraverse(h.root);
        h.height(h.root,0);
        System.out.println(h.max);

    }


}
