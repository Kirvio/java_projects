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
        Test test = new Test("Egor", 5.7, 1);
        Test test_1 = new Test("Antony", 7.8, 2);
        System.out.println(test.getRolln() + " : " + test.getName() + " : " + test.getMarks());
        System.out.println(test_1.getRolln() + " : " + test_1.getName() + " : " + test_1.getMarks());
    }
}