// Inner Classes example
// and Abstract class trick with Anonymus object
//interface is like a class just by default all the methods are public abstract

import java.util.Scanner;

interface Computer{
    // all methods in interface are public abstract by default
    void RunCode();
    int age=44;
    String area="Belarus"; // final and static by default
    // class B{
    //     public void config(){
    //         System.out.println("in config");
    //     }
    // }
}
// SAM(Single Abstract Method) Interface
interface NewFeature{
    void Feature();
}
// Types of interfaces
// Functional Interface or SAM(only one method)
// Normal Interface(multiple methods)
// Marker Interface(no methods)
// Marker interface are used for serialization
// Serialization is a concept, when you want to save your data from an object
// to hard drive and then, when you load your data in the fresh object this
// is called deserialization
@FunctionalInterface
interface Example{
    // Ducking exception using throws keyword in Java
    int show(int i, int j) throws ClassNotFoundException;
}
// class - class -> extends
// interface - interface -> extends
// class - interface -> implements
// you CAN implement multiple interfaces with one class
// you cannot do it with an abstract classes
class Laptop implements Computer, NewFeature
{
    public void RunCode()
    {
        System.out.println("Run, Compile, Execute in a Laptop");
    }
    public void Feature()
    {
        System.out.println("New Feature");
    }
}

class Desktop implements Computer
{
    public void RunCode()
    {
        System.out.println("Run, Compile, Execute in a Desktop");
    }
}

class Developer
{
    public void work(Computer comp)
    {
        comp.RunCode();
        System.out.println("coding...");
    }
}

// My Exception example
class MyException extends RuntimeException{
    public MyException(String str){
        //sending inc String to Upperclass
        super(str);
    }
}

public class InerClasess {
    public static void main(String[] args) {
        // Computer comp = new Desktop();
        // Developer dev = new Developer();
        // dev.work(comp);
        // Anonymus Inner Object
        // Lambda expression in Java
        // they are working only with FunctionalInterfaces
        // Exception hadnling in Java
        Example f = (i,j) -> i/j;
        int result = 0;
        // try with resources example
        try(Scanner sc = new Scanner(System.in))
        {
            // Hot to take input in Java
            // Using BufferedReader concept
            // InputStreamReader in = new InputStreamReader(System.in);
            // BufferedReader bf = new BufferedReader(in);
            // parses an input string to get a number
            // int num = Integer.parseInt(bf.readLine());
            // int num1 = Integer.parseInt(bf.readLine());
            // Using Scanner concept
            int num = sc.nextInt();
            int num1 = sc.nextInt();
            System.out.println("first number: " + num);
            System.out.println("second number: " + num1);
            result = f.show(num, num1);
            if(result == 0) throw new MyException("result should not be 0");
            // try
            // {
            //     if(result == 0) throw new MyException("result should not be 0");
            //     //System.out.println(nums[5]);
            //     //result = 18/g;
            // }
            // catch(MyException e)
            // {
            //     // BTW println belongs to a PrintStram class
            //     // OUT is a static variable inside the System class
            //     // object of which is created when we call System.out
            //     System.out.println("Something went wrong " + e);
            // }
            // catch(IndexOutOfBoundsException e){
            //     System.out.println("Choose appropriate number" + e);
            // }
            // catch(Exception e){
            //     System.out.println("Something went wrong... " + e);
            // }
        }
        // catch(IOException e)
        // {
        //     e.printStackTrace();
        // }
        catch(MyException e)
        {
            e.printStackTrace();
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong... " + e);
        }
        finally
        {
            System.out.println("Result of divide: " + result);
            // close IO socket
            // sc.close();
        }
        // Anononymus obj example
        // it is used, when you want to override method only once in your programm
        // Anonymus inner class
        // A obj = new A()
        // {
        //     public void show()
        //     {
        //         System.out.println("in new show");
        //     }
        // };
        //A.B obj1 = obj.new B();
    }
}
