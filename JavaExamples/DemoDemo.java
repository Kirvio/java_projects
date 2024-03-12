import tools.*;
// in java to make package unic, people using reverse domain names
// general idea: one file - one class
// do not use default modifier, use protected, public or private

// we cannot create object of an abstract class
// abstract is usefull when you want to declare method
// but do not know what to do with him at the moment
abstract class Driver{
    abstract void SomeCode();
    abstract void PlayMusic();
}

abstract class SuperDriver extends Driver{
    public void SomeCode(){
        System.out.println("Some code...");
    }
}

class JustDriver extends SuperDriver{
    public void PlayMusic(){
        System.out.println("Music is playing..");
    }
}

public class DemoDemo
{
    public static void main(String a[])
    {
        System.out.println("Welcome to calc programm");
        VeryAdvCalc calc = new VeryAdvCalc();
        int add = calc.add(4, 3);
        int sub = calc.sub(8, 5);
        int multi = calc.multi(5, 4);
        double div = calc.div(18, 3);
        int power = calc.power(2, 20);
        System.out.println(add + " : " + sub + " : " + multi + " : " + div + " : " + power);

        // Runtime Polymorphism(Dynamic Method Dispatch) in Java example
        // via method overriding and inheritance
        // Calc NormalCalc = new Calc();
        // NormalCalc.show();
        // NormalCalc = new AdvCalc();
        // NormalCalc.show();
        // NormalCalc = new VeryAdvCalc();
        // NormalCalc.show();
        Driver drive = new JustDriver();
        drive.SomeCode();
        drive.PlayMusic();
    }
}