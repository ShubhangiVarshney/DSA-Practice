import java.util.ArrayList;

class NaryTree{

    Node root;
    static class Node{
        int data;
        ArrayList<Node> child;
        Node(int n){
            this.data=n;
            child=new ArrayList<>();
        }
    }

    void printTree(Node root){
            String s= root.data+"=";
            for (int i=0; i<root.child.size(); i++){
                s=s+root.child.get(i).data+", ";
            }
            System.out.println(s);
            for(int i=0; i<root.child.size(); i++){
                printTree(root.child.get(i));
            }
    }

    void LevelOrder(Node root){

    }

    public static void main(String[] args){
        Node root=new Node(2);
        Node node1=new Node(3);
        Node node2=new Node(4);
        Node node3=new Node(5);
        Node node4=new Node(6);
        Node node5=new Node(7);

        root.child.add(node1);
        root.child.add(node2);
        root.child.add(node3);
        node2.child.add(node4);
        node2.child.add(node5);

        NaryTree n1=new NaryTree();
        n1.printTree(root);

    }

}