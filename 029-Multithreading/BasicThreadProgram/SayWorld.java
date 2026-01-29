import Runnable.*;

public class SayWorld{
    public static void main(String[] args){
        SayHello obj = new SayHello();
        Thread t = new Thread(obj);
        t.start();

        for(;;){
            System.out.println("World");
        }
    }
}