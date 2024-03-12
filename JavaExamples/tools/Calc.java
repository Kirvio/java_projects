package tools;

// access modifiers
// public means it can be accessed from anywere
// private means it can be accessed from the same class
// default means it can be accessed in the same package
// protected means it can be accessed in subclass in another package
public class Calc
{
    public int add(int a, int b)
    {
        return a + b;
    }
    public int sub(int a, int b)
    {
        return a - b;
    }
    public void show()
    {
        System.out.println("in Calc");
    }
}
