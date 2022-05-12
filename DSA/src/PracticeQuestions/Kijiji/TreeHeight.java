package PracticeQuestions.Kijiji;

import PracticeQuestions.Q257BinaryTreePath;

public class TreeHeight {
    public static class Node {
        String val;
        Node left;
        Node right;

        Node() {
        }

        Node(String val) {
            this.val = val;
        }

        Node(String val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        Node(Node left, Node right) {

            this.left = left;
            this.right = right;
        }

        public Node getLeft() {
            return this.left;
        }

        public Node getRight() {
            return this.right;
        }

        public int height() {
           // System.out.println("ROOT HEIGHT : " + this.val);
            int leftHeight = getHeight(this.left);
            int rightHeight = getHeight(this.right);
           // System.out.println("ROOT HEIGHT DONE : " + leftHeight + " : " + rightHeight);
            return Math.max(leftHeight, rightHeight);
        }

        private int getHeight(Node node) {
            if (node == null) {
                return 1;
            } else {
                int leftHeight = getHeight(node.left);
                int rightHeight = getHeight(node.right);
               // System.out.println("GET HEIGHT : " + node.val + " : " + leftHeight + " : " + rightHeight);
                return Math.max(leftHeight + 1, rightHeight + 1);
            }

        }

        public static void main(String[] args) {
            Node leaf8 = new Node("leaf8", null, null);
            Node leaf7 = new Node("leaf7", null, null);
            Node leaf6 = new Node("leaf6", leaf8, null);
            Node leaf5 = new Node("leaf5", leaf6, null);
            Node leaf4 = new Node("leaf4", leaf5, null);
            Node leaf3 = new Node("leaf3", leaf7, null);
            Node leaf1 = new Node("leaf1", leaf3, null);
            Node leaf2 = new Node("leaf2", null, leaf4);
            Node node = new Node("node", leaf1, null);
            Node root = new Node("root", node, leaf2);

            System.out.println(root.height());

            Node test = new Node(null, null);
            System.out.println(test.height());

        }
    }

}

