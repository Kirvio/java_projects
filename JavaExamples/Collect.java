// Collection API - concept(API simply means library that contents nessery features,
// simply use them)
// Collection - interfaces and classes that implemeting this
// Collections a class that has a multiple methods to work with
// we use collection api in java when we work with Data Structures, like stack, queue etc.
// Collection works with objects, so even if you use primitves, they'll be converted to objects 

import java.util.ArrayList;
import java.util.Collections;
// import java.util.Comparator;
import java.util.List;

// if you want to give power of sorting an object to itself
// then use Comparable
// how to implement comparabale
class Student implements Comparable<Student> {
    int age;
    int rolln;
    String name;

    public String toString() {
        return rolln + " : " + age + " : " + name;
    }

    public Student(int rolln, int age, String name) {
        this.rolln = rolln;
        this.age = age;
        this.name = name;
    }

    // we implement interface method to compare values
    // object compairs its object to itself
    public int compareTo(Student that) {
        if(this.age > that.age)
            return 1;
        else
            return -1;
    }
    
}

public class Collect {
    public static void main(String[] args) {
        // There are a lot of classes that implement collection interface
        // we use ArrayList here, to specify type of an array
        // in Java we use angular brackets, for example:
        // Collection<Integer> nums = new ArrayList<Integer>();
        // if you want to get an index, use list cause Collection
        // does not support indexes
        // List<Integer> nums = new ArrayList<Integer>();
        // TreeSet - ordering + unique values, HashSet - contains only unique values
        // Set<Integer> nums = new TreeSet<Integer>();
        // Comparator is an interface, that let's you 
        // specify your own logic for sorting
        // Comparator<Student> comp = (i, j) -> i.age>j.age?1:-1;
        List<Student> stud = new ArrayList<>();
        stud.add(new Student(1, 21, "Egor"));
        stud.add(new Student(2, 24, "Igor"));
        stud.add(new Student(3, 28, "John"));
        stud.add(new Student(4, 30, "Biden"));
        // Iterator<Integer> values = stud.iterator();
        // while(values.hasNext()){
        //     System.out.println(values.next());
        // }
        // Map example
        // if you are working with threads, use Hashtable it's synchronized
        // Map<String, Integer> students = new HashMap<>();

        // students.put("Egor", 8);
        // students.put("Igor", 6);
        // students.put("Anna", 9);
        // students.put("Evgeniy", 5);
        // students.put("Katya", 8);
        // // In Map key values represented in set format
        // // value in a list format
        // for(String key : students.keySet()){
        //     System.out.println(key + " : " + students.get(key));
        // }
        Collections.sort(stud);
        for(Student n : stud)
            System.out.println(n);
        // for(int i=0;i<nums.size();i++){
        //     System.out.println(i + " : ");//nums.get(i));
        // }
    }
}
