// Threads example in Java
// if you want a obj to be a thread
// class of that object should have run method
// inside, and when you want to execute threads
// win Java, we use start() method
// Threads priority values from 1(lowest) - 10(highest) priority
// another way to create a Thread is to implement Runnable interface
// class A implements Runnable{           //extends Thread{
//     public void run(){
//         for(int i=0;i<=10;i++){
//             System.out.println("Hi");
//             try {
//                 Thread.sleep(15);
//             } catch (InterruptedException e) {e.printStackTrace();}
//         }
//     }
// }

// class B implements Runnable{//extends Thread{
//     public void run(){
//         for(int i=0;i<=10;i++){
//             System.out.println("Hello");
//             try {
//                 Thread.sleep(15);
//             } catch (InterruptedException e) {e.printStackTrace();}
//         }
//     }
// }
class Counter
{
    int count=0;
    // making method ThreadSafe with synchronized keyword
    // one Thread can work with that method at one time
    public synchronized void increment(){
        count++;
    }
}

// Thread states - New(start())->Runnable(run())->Running(slept(),wait())->Waiting, (do not kill threads)Dead
// Waiting(notify())->Runnable
public class New {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        // Runtime Polymorphysm
        // Changing the type of an anonymus object
        // we can use Lambda expression cause Runnable is a #FunctionalInterface
        Runnable obj = () ->
        {
            for(int i=1;i<=1000;i++){
                c.increment();
                // System.out.println("Hi");
                // try {
                //     Thread.sleep(17);
                // } catch (InterruptedException e) {e.printStackTrace();}
            }
        };
        Runnable obj1 = () ->
        {
            for(int i=1;i<=1000;i++){
                c.increment();
                // System.out.println("Hello");
                // try {
                //     Thread.sleep(17);
                // } catch (InterruptedException e) {e.printStackTrace();}
            }
        };
        // if we do not extending Thread with our classes
        // we should create Thread objects, and pass our objects to Thread method
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);
        t1.start();
        // try {
        //     Thread.sleep(2);
        // } catch (InterruptedException e) {e.printStackTrace();}
        t2.start();
        // join is a special method that allowes main to wait till 
        // threads to come back and join
        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}

// ThreadSafe concept means that one thread can work with data at one Time
// Mutation concept means that value of some variable(or object) can change
