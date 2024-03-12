package DataStruct.Stack;

// Stack implementation
// LIFO(Last In First Out)

public class Stack {

    private int[] stack = new int[5];

    // Current top of the stack
    private int top = 0;

    // Insert element in our Stack
    public void push(int data)
    {
        if(top==5)
        {
            System.out.println("Stack is Full!");
        }
        else
        {
            stack[top] = data;

            // After inserting, top value increases
            top++;
        }
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
        }
        return data;
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
            System.out.println(num + " ");
        }
    }
}
