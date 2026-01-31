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
            Thread.yield();
        }
    } 
}

public class YieldMethod{
    public static void main(String[] args){
        Tmp obj1 = new Tmp();
        Tmp obj2 = new Tmp();
        System.out.println("Before Using yield method...");
        obj1.start();
        obj2.start();

        

    }
}