package DataStruct.LinkedList;

public class Node {

    // Data type for values in LinkedList
    private int data;

    // Reference to the next node
    private Node next;

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
