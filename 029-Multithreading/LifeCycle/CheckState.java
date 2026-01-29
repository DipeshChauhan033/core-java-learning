public class CheckState extends Thread{

    @Override
    public void run(){    //throws InterruptedException---- not allow because it is override method must be use try catch
        System.out.println("Running");
        try{
            Thread.sleep(4000);
            System.out.println("After 4 sec..");
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException{
        CheckState t1 = new CheckState();
        System.out.println(t1.getState());  //object Create but not started

        t1.start();
        System.out.println(t1.getState()); // After the start method it goes into runnable state

        Thread.sleep(3000);
        System.out.println("After 3 sec..");
        System.out.println(t1.getState());
        
        t1.join();
        System.out.println(t1.getState());
        
    }
}