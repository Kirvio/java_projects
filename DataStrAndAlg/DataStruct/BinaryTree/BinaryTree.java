package DataStruct.BinaryTree;

public class BinaryTree {

    Node root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    // Method for recursion calls
    // tree nodes insertion
    public Node insertRec(Node root, int data)
    {

        // If our BinaryTree do not have root node, create one
        if(root==null)
            root = new Node(data);

        // If data is lesser then current root data
        // make it left Node data
        else if(data < root.getData())

            // Make current left root our new root for recursion call
            root.setLeft(insertRec(root.getLeft(), data));
        else if(data > root.getData())
            root.setRight(insertRec(root.getRight(), data));

        return root;
    }

    // Binary Tree traversal:
    // in order
    // pre order
    // post order (left->right->root)

    // in order example (left->root->right)
    public void inOrder()
    {
        inOrderRec(root);
    }

    public void inOrderRec(Node root)
    {
        if(root != null)
        {
            inOrderRec(root.getLeft());
            System.out.print(root.getData() + " ");
            inOrderRec(root.getRight());
        }
    }
}
