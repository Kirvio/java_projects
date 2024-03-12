package tools;

// for inheritance you do not need .java file
// you only need .class file
// AdvCalc - is a subclass of Calc(superclass)
// when class extends only one class, it's called singlelevel inheritance
public class AdvCalc extends Calc
{
    public int multi(int a, int b)
    {
        return a*b;
    }
    public double div(double a, double b)
    {
        return a/b;
    }
    public void show()
    {
        System.out.println("in AdvCalc");
    }
}