class Human
{
    // encapsulation example
    // whenever you define instance variables, it is considering a good practise to
    // make them private, so no one can acces it by simple obj reference
    private int age;
    private String name;

    public String getName()
    {
        return name;
    }

    // this keyword references to current object
    // so, java knows that "name" variable is belongs to
    // an object, that uses "setName" method
    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}


class Student {
    int rolln;
    double marks;
    String name;
    // static variable are the same for all objects
    // as a static block, it is called only once
    // so, you can create multiple object and static method
    // will be called only once
    // All created objects are referencing static variable,
    // that jvm keeps outside of heap
    static String type_of_student;

    static
    {
        type_of_student = "Human";
    }

    //constructor
    public Student()
    {
        rolln = 0;
        marks = 0.0;
        name = "";
    }
}

public class Demo {
    // use "void" keyword, if you do not expect this method to return anything
    // static main means, that there is no need to create an object first
    // to use main method
    // JVM looks for the signature
    // String[] args stores Java command-line arguments and is an array of type java.lang.String class
    public static void main(String[] args) 
    {
        //array of objects in java
        Student s1 = new Student();
        s1.marks = 70.50;
        s1.name = "Alibaba";
        s1.rolln = 1;

        Student s2 = new Student();
        s2.marks = 81.56;
        s2.name = "George";
        s2.rolln = 2;

        Student s3 = new Student();
        s3.marks = 98.90;
        s3.name = "Natasha";
        s3.rolln = 3;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for(int i=0;i<students.length;i++){
        //     System.out.println(" " + students[i].rolln + "  " + students[i].name + " : " + students[i].marks);
        // }
        //enhanced for loop
        for(Student stud : students){
            System.out.println(" " + stud.rolln + "  " + stud.name + " : " + stud.marks + " " + Student.type_of_student);
        }

        Human human_obj = new Human();
        human_obj.setName("Egor");
        human_obj.setAge(28);

        System.out.println(human_obj.getName() + " : " + human_obj.getAge());
    }    
}
