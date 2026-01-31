public class SetPriority extends Thread{
    public SetPriority(String msg){
        super(msg);
    }

    @Override
    public void run(){
        int sum = 0;
        for(int i=0;i<=10;i++){
            sum+=1;
            try{
                Thread.sleep(100);
            }
            catch(Exception e){}
                System.out.println("ThreadName: "+Thread.currentThread().getName()+", "+"Priority: "+Thread.currentThread().getPriority()+", Count "+ i);
        }
    }

    public static void main(String[] args){
        SetPriority l = new SetPriority("Low Priority");
        SetPriority m = new SetPriority("Medium Priority");
        SetPriority h = new SetPriority("High Priority");
        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.MIN_PRIORITY);
        h.setPriority(Thread.MIN_PRIORITY);
        l.start();
        m.start();
        h.start();
    }
}