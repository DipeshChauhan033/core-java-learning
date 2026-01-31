class Tmp extends Thread{
    @Override
    public void run(){
        
        for(int i = 0;i<=5;i++){
            System.out.println("Thread: "+Thread.currentThread().getName() + " Is running");
        }
    } 
}

class Tmp1 extends Thread{
    @Override
    public void run(){
        for(int i = 0;i<=5;i++){
            System.out.println("Thread: "+Thread.currentThread().getName() + " Is running");
            Thread.yield();   //gives chance to another process
        }
    } 
}

public class YieldMethod{
    public static void main(String[] args) throws InterruptedException{
        
        Tmp obj1 = new Tmp();
        Tmp obj2 = new Tmp();
       
       
        System.out.println("Before Using yield method...");
        obj1.start();
        obj2.start();

        obj1.join();
        obj2.join();

        System.out.println();
        
        Tmp1 obj3 = new Tmp1();
        Tmp1 obj4 = new Tmp1();

        System.out.println("After Using yield method...");
        obj3.start();
        obj4.start();
        

    }
}