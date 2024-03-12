import DataStruct.BinaryTree.BinaryTree;

public class Runner {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(4);
        tree.insert(15);
        tree.insert(3);
        tree.inOrder();
        // Queue queue = new Queue();
        // queue.enQueue(10);
        // queue.enQueue(7);
        // queue.enQueue(9);
        // queue.enQueue(4);
        // queue.deQueue();
        // queue.deQueue();
        // queue.enQueue(9);
        // queue.enQueue(4);
        // System.out.println(queue.isEmpty());
        // queue.enQueue(2);
        // queue.enQueue(1);
        // queue.enQueue(6);
        // queue.enQueue(16);
        // System.out.println(queue.isFull());
        // System.out.println("Size " + queue.getSize());
        // queue.show();
    }
}
