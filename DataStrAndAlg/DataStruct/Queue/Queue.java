package DataStruct.Queue;

public class Queue {

    // Queue implementation as as Array
    private int[] queue = new int[5];

    // Size of oue Queue
    private int size;

    // Beginning of our queue
    private int front;

    // End position of our queue
    private int rear;


    // Insert element in our Queue(rear++)
    public void enQueue(int data)
    {
        if(!isFull())
        {
            queue[rear] = data;

            // % returns the rest of a division by 5(size of our array)
            // (5%5 is 0, 6%5 is 1, etc)
            // so our queue would go full circle
            rear = (rear+1)%5;
    
            // Increasing size of our array as well
            size++;
        } else {
            System.out.println("The Queue is Full!");
        }
    }

    public int deQueue()
    {
        // Getting our first value
        int data = queue[front];

        if(!isEmpty())
        {
            // Deleting first value from our queue
            front = (front+1)%5;

            // Reducing size of our queue, after we moving first value
            size--;
        } else {
            System.out.println("Queue is Empty!");
        }

        return data;
    }

    public int getSize()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return size==0;
    }

    public boolean isFull()
    {
        return getSize()==5;
    }

    public void show()
    {
        System.out.println("Elements in our queue: ");
        for(int i=0;i<size;i++)
        {
            System.out.print(queue[(front + i)%5] + " ");
        }
        System.out.println();
        for(int n : queue)
        {
            System.out.print(n + " ");
        }
    }
}
