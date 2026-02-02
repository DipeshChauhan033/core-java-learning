package Synchronization;

public class Counter{
    private int count = 0;

    //public synchronized void increment()..  {  //if not use synchronized it will print diff count each time bcz in test file thread use same obj and simulataneously
    public  void increment(){
        synchronized(this){     //block code 
            count++;
        }
    }

    int getCount(){
        return count;
    }
}