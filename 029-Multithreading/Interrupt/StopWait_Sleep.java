class Tmp extends Thread{
    @Override
    public void run(){
        try{
            Thread.sleep(1000);
            System.out.println("Program running...");
        }
        catch(Exception e){
            System.out.println("Exception: "+e);
        }
        
    }
}

public class StopWait_Sleep{
    public static void main(String[] args){
        Tmp obj = new Tmp();
        obj.start();
        obj.interrupt();
    }
}