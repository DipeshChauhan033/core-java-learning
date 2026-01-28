package BasicThreadProgram;

public class PrintWorld extends Thread{
    @Override
    public void run(){
        for(; ;){
            System.out.println("world");
        }
    }
}