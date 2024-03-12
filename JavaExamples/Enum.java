// enum Status is a class in Java
// enum extends Enum class by default
enum Laptops{
    // named constants in enum are objects
    Lenovo(1000), ASUS(800), HP(900), MacBook(1800);
    private int price;
    private Laptops(int price){
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}

class A{
    public void showMeTheDataThatBelongsToThisClass(){
        System.out.println("in A show");
    }
}

class B extends A{
    // annotation in Java(helping you with operation that you want to do)
    @Override
    public void showMeTheDataThatBelongsToThisClass(){
        System.out.println("in B show");
    }
}


public class Enum {
    public static void main(String[] args) {
        B obj = new B();
        obj.showMeTheDataThatBelongsToThisClass();
        // for(Laptops lap : Laptops.values()){
        //     System.out.println(lap + " : " + lap.getPrice());
        //Laptops lap = Laptops.MacBook;
            // String result = lap + " : " + lap.getPrice();
            // switch (lap) {
            //     case Lenovo:
            //         System.out.println(result);
            //         break;
            //     case ASUS:
            //         System.out.println(result);
            //         break;
            //     case HP:
            //         System.out.println(result);
            //         break;
            //     default:
            //         System.out.println(result);
            //         break;
            // }
        //}
    }
}
