package Synchronization;

public class MyThread extends Thread{
    private Counter counter;

    public MyThread(Counter counter,String msg){
        this.counter = counter;
        super(msg);
    }

    @Override
    public void run(){
        for(int i = 0;i<1000;i++){
            counter.increment();
        }
    }
}