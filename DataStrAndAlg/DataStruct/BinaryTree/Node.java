package DataStruct.BinaryTree;

public class Node {
    // Tree node need three parameters
    // Data, Left Node, Right Node

    private int data;
    private Node left;
    private Node right;

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
    
    public int getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public Node(int data){
        this.data = data;
    }
}
