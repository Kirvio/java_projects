class Mobile
{
    String brand;
    static String name;
    int price;

    static
    {
        name = "Smartphone";
        System.out.println("in static block");
    }

    // Constructor
    public Mobile()
    {
        brand = "";
        price = 200;
        System.out.println("in constructor");
    }

    public void show()
    {
        System.out.println(name + " : " + brand + " : " + price);
    }

    // No need to create an object for static method;
    // You can pass an object as an argument and create a reference; obj.brand etc...
    public static void static_method(Mobile obj)
    {
        System.out.println(name + " : " + obj.brand + " : " + obj.price);
    }

}


public class Hello
{
    public static void main(String args[])
    {
        // length and capacity are different things!
        // StringBuffer str = new StringBuffer("Egor");
        // str.append(" Andyshchenko");
        // System.out.println(str.capacity());
        // System.out.println(str);

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1000;

        Mobile obj2 = new Mobile();
        obj2.brand = "Nokia";

        Mobile.static_method(obj2);
    }
}