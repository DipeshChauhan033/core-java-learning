package BasicThreadProgram;

public class PrintHello{
    public static void main(String[] args){

        PrintWorld obj = new PrintWorld();
        obj.start();

        for(; ;){   //infinite loop
            System.out.println("Hello");
        }
    }
}
