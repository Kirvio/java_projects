package DataStruct.Stack;

// Stack implementation
// LIFO(Last In First Out)

// Dynamic Stack implementation
public class DStack {

    // Default capacity of our stack
    private int capacity = 2;
    private int[] stack = new int[capacity];

    // Current top of the stack
    private int top = 0;

    // Insert element in our Stack
    public void push(int data)
    {

        // Expand an Array when it have reached its full capacity
        if(size()==capacity)
            expand();

        stack[top] = data;

        // After inserting, top value increases
        top++;
    }

    // This method creates new array
    // And copying values from last array to new array
    private void expand() {

        // Getting length of our array
        int length = size();

        // Creating new array with more space available
        int[] newStack = new int[capacity*2];

        // Copying elements from last array into new
        System.arraycopy(stack, 0, newStack, 0, length);

        // Changing reference of our array obj
        stack = newStack;

        // Increasing default capacity after every expand operation
        capacity *= 2;
    }

    // Delete first element from our stack
    public int pop()
    {

        int data=0;

        if(isEmpty())
        {
            System.out.println("Stack is Empty!");
        }
        else
        {
            // Decreasing top value to get current top value
            top--;
            data = stack[top];
            stack[top] = 0;
            shrink();
        }
        return data;
    }

    // Method to Shrink an array if there not enough elements
    private void shrink()
    {

        int length = size();

        // if length of an array is lesser then 1/4
        // shrink it
        if(length<=(capacity/2)/2)
            capacity /= 2;
        int[] newStack = new int[capacity];

        // Copying elements from last array into new
        System.arraycopy(stack, 0, newStack, 0, length);

        // Changing reference of our array obj
        stack = newStack;
    }

    public int peek()
    {
        int data;
        data = stack[top-1];
        return data;
    }

    public int size()
    {
        return top;
    }

    public boolean isEmpty()
    {
        return top<=0;
    }

    public void show()
    {
        for(int num : stack){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
