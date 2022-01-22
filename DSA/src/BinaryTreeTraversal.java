// Recursive Traversal of Binary tree
public class BinaryTreeTraversal {
    Node root;
    Node left,right;

    static class Node {
        int data;
        Node left, right;

        Node(int n) {
            data = n;
            left = right = null;
        }
    }

    void printPreOrder(Node root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        printPreOrder(root.left);
        printPreOrder(root.right);

    }

    void printInOrder(Node root) {
        if (root == null)
            return;

        printInOrder(root.left);
        System.out.print(root.data + " ");
        printInOrder(root.right);
    }

    void printPostOrder(Node root) {
        if (root == null)
            return;

        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.data + " ");

    }


    public static void main(String[] args) {
        BinaryTreeTraversal tree = new BinaryTreeTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.print("Post-Order Traversal: \n");
        tree.printPostOrder(tree.root);
        System.out.println("\nPre-Order Traversal:");
        tree.printPreOrder(tree.root);
        System.out.println("\nIn-Order Traversal:");
        tree.printInOrder(tree.root);

    }
}
