public class Test extends Thread{
    @Override
    public void run(){
        for(;;){
            System.out.println("Hello");
            System.out.println(Thread.currentThread().getName());
        }
    }
    public static void main(String[] args){
        Test obj = new Test();
        obj.start();

        for(;;){
            System.out.println("World");
            System.out.println(Thread.currentThread().getName());
        }
    }
}