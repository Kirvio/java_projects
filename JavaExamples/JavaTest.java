// final keyword defines const var in Java
// when you use it in class you make class non inheritable
// when you use it in method you make that method non overridable
// every class in Java extends an Object class
// every time you try to print an object it will call toString
// method from an Object class
class Computer
{
    public void show(){
        System.out.println("in Computer");
    }
}
class Laptop extends Computer
{
    String model;
    int price;

    public void show1(){
        System.out.println("in Laptor");
    }

    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

}
final class A{
    final public void a() {
        System.out.println("No one can inherit A class");
    }
}


public class JavaTest {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "Lenovo";
        obj.price = 1000;
        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo";
        obj1.price = 1000;
        // Downcasting
        Computer cal = new Laptop();
        Laptop cal1 = (Laptop) cal;
        cal1.show1();

        System.out.println(obj.equals(obj1));
    }
}
