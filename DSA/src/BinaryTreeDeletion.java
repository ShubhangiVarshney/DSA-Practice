import java.util.Queue;
import java.util.LinkedList;

public class BinaryTreeDeletion {
    Node root;
    Node temp = root;

    class Node {
        int data;
        Node left, right;

        Node(int n) {
            this.data = n;
            this.left = null;
            this.right = null;
        }
    }

    void DeleteElement(Node root, int key) {
        Node temp = root;
        if (temp == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            temp = q.remove();
            if (temp.left != null)
                q.add(temp.left);
            if (temp.right != null)
                q.add(temp.right);
        }

        System.out.println("\nDeepest node: " + temp.data);

        deleteDeepest(root, temp);

        Node current = root;
        if (current.data == key) {
            root.data = temp.data;
            return;
        }
        Queue<Node> u = new LinkedList<>();
        u.add(root);
        while (!u.isEmpty()) {
            current = u.remove();
            if (current.left != null) {
                if (current.left.data == key) {
                    current.left.data = temp.data;
                    break;
                } else
                    u.add(current.left);
            }
            if (current.right != null) {
                if (current.right.data == key) {
                    current.right.data = temp.data;
                    break;
                } else
                    u.add(current.right);
            }
        }
    }

    void deleteDeepest(Node root, Node delNode) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        // Do level order traversal until last node
        while (!q.isEmpty()) {
            Node temp = q.remove();
            if (temp == delNode) {
                temp = null;
                return;
            }

            if (temp.left != null) {
                if (temp.left == delNode) {
                    temp.left = null;
                    return;
                } else
                    q.add(temp.left);
            }
            if (temp.right != null) {
                if (temp.right == delNode) {
                    temp.right = null;
                    return;
                } else
                    q.add(temp.right);
            }
        }

    }

    void InsertElement(Node temp, int e) {

        if (temp == null) {
            root = new Node(e);
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            temp = q.remove();
            if (temp.left != null)
                q.add(temp.left);
            else {
                temp.left = new Node(e);
                break;
            }
            if (temp.right != null)
                q.add(temp.right);
            else {
                temp.right = new Node(e);
                break;
            }
        }
    }

    void printInOrder(Node root) {
        if (root == null)
            return;

        printInOrder(root.left);
        System.out.print(root.data + " ");
        printInOrder(root.right);
    }

    public static void main(String[] args) {
        BinaryTreeDeletion btd = new BinaryTreeDeletion();
        btd.InsertElement(btd.root, 3);
        btd.InsertElement(btd.root, 45);
        btd.InsertElement(btd.root, 15);
        btd.InsertElement(btd.root, 90);
        btd.InsertElement(btd.root, 34);
        btd.InsertElement(btd.root, 51);
        btd.InsertElement(btd.root, 77);
        btd.printInOrder(btd.root);
        btd.DeleteElement(btd.root, 90);
        btd.printInOrder(btd.root);
    }
}
