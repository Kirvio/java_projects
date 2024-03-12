class A extends Object       // superclass(every class in Java is a subclass of Object class btw)
{
    public A(){
        super();
        System.out.println("in A constructor");
    }
    public A(int n){
        this();
        System.out.println("in parametarized A constructor");
    }
}

class B extends A{          // B is a subclass of A(multilevel inheritance in action)
    public B(){
        super(5);         // every constructor in Java has super method, even if you do not mentioning it
        System.out.println("in B constructor");
    }
    public B(int n){
        this();             // this is calling a default constructor of this Class
        System.out.println("in parametarized B constructor");
    }
}
/*
Inheritance - is the most important thing in OOP


Camel casing: myNameIsEgor
Snake casing: my_name_is_Egor
Camel casing used in Java by default
*/

class Test
{
    private String name;
    private double marks;
    private int rolln;

    public Test() {
        name = "";
        marks = 0;
        rolln = 0;
    }

    public Test(String name, double marks, int rolln) {    //Parametarized constructor
        this.name = name;
        this.marks = marks;
        this.rolln = rolln;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
    this.marks = marks;
    }

    public int getRolln() {
        return rolln;
    }

    public void setRolln(int rolln) {
        this.rolln = rolln;
    }

    
}

public class Tests
{
    public static void main(String[] args) {
        // Test test = new Test("Egor", 5.7, 1);
        // Test test_1 = new Test("Antony", 7.8, 2);
        // System.out.println(test.getRolln() + " : " + test.getName() + " : " + test.getMarks());
        // System.out.println(test_1.getRolln() + " : " + test_1.getName() + " : " + test_1.getMarks());
        new B(5);  // Anonymus object
    }
}