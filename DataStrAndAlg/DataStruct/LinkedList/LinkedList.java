package DataStruct.LinkedList;

public class LinkedList {

    // Reference to the First node of LinkedList
    private Node head;

    // Insert data in our LinkedList
    // Add data at the end
    public void insert(int data)
    {

        // When we assigning new value with insert method
        // we creating new node object,
        // with null next obj reference by default
        Node node = new Node();
        node.setData(data);

        // Check, if it's the first object that we are inserting
        if(head==null)
        {

            // Assign node itself as a head
            head = node;

        }

        // node isn't a first object(node.getNext()!=null))
        else 
        {

            // Create a node and assign head reference
            // Temporary node(n) to hold the data
            Node n = head;

            // Travel in our LinkedList, until we reach the end
            // reference of the last (new)object is null
            while(n.getNext()!=null)
            {

                // Jumping between node(object) references
                n = n.getNext();

            }

            // Once we got last obj(null reference)
            // assign reference value of new node to last obj
            n.setNext(node);

        }
    }

    public void insertAt(int index, int data)
    {
        Node node = new Node();
        node.setData(data);

        // Whenever you want to Traverse, start from this statement
        Node n = head;

        // if index equal 0 simply call insertAtStart method
        if(index==0)
        {
            insertAtStart(data);
        } else {

            // Reach till index
            // -1 to reach previous node obj refernce by refering next
            for(int i=0;i<index-1;i++)
            {
                n = n.getNext();
            }

            // assign to new node reference of previous node object(n)
            node.setNext(n.getNext());

            // update reference in previous node(n) to new node object
            n.setNext(node);
        }
    }

    public void insertAtStart(int data)
    {
        Node node = new Node();
        node.setData(data);
        // New head node will have a reference of previous head node
        node.setNext(head);
        
        head = node;
    }

    public void deleteAt(int index)
    {

        // "Deleting" first element, by changing obj reference
        if(index==0)
        {

            // change first obj reference to previous
            // LinkedList head obj reference
            head = head.getNext();
        } else {
            Node n = head;

            // Temporary node for next object
            Node n1 = null;

            // Reach till index
            // -1 to reach previous node obj refernce by refering next
            for(int i=0;i<index-1;i++)
            {
                n = n.getNext();
            }

            // assign to next node (obj)reference of previous node object(n)
            n1 = n.getNext();

            // assigning new reference to previous object
            // of object, that is positioned AFTER next object
            n.setNext(n1.getNext());

            // We deleted obj reference from our list.
            // Now we making our object eligible for garbage collection by nullifying it.
            n1 = null;

        }
    }

    public void show()
    {
        Node node = head;

        while (node.getNext()!=null) {
            System.out.println(node.getData());

            // Jump to the next node
            node = node.getNext();
        }

        // Print last value(with null reference)
        System.out.println(node.getData());
    }
}
