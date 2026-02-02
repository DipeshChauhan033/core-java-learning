package Synchronization;

public class Test {
    public static void main(String[] args){

        Counter counter = new Counter();
        MyThread obj1 = new MyThread(counter,"Thread1"); 
        MyThread obj2 = new MyThread(counter,"Thread2"); 

        obj1.start();
        obj2.start();
        try{
            obj1.join();
            obj2.join();
        }
        catch(Exception e){}

        System.out.println(counter.getCount());
        System.out.println(obj1.getName());
        System.out.println(obj2.getName());

    }
}