package tools;

// multilevel inheritance
// when you using same method name and same parameters
// in subclass as in superclass, method of subclass
// will "override" superclass method
// to "overload" method you can pass different numer
// of parameters or use different types
public class VeryAdvCalc extends AdvCalc
{
    public int power(int a, int b)
    {
        int result;
        result = (int)Math.pow(a, b);
        return result;
    }

    public void show()
    {
        System.out.println("in VeryAdvCalc");
    }
}