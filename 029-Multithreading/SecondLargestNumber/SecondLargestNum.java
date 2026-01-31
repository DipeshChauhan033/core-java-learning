class GetArray extends Thread{
    void tmp() throws InterruptedException{
        Thread.sleep(5000);
    }
    static int[] iarr = {600,30,50,150,20,602,14,6,2,59,2,0,601,5,9,99,2,22,5,300,450,88,500};
}

class FindingSecondLargestNum extends GetArray implements Runnable{
    @Override
    public void run(){
        try{
            System.out.println("In.. RUNNNING");
            Thread.sleep(3000);
            
            int[] arr = GetArray.iarr;
            int count = 0;
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length;j++){
                    if(arr[i]>arr[j]){
                        count+=1;
                    }
                }
                if(count==arr.length-2){
                    System.out.println("Largest num is : "+arr[i]);
                    break;
                }
                else{
                    count=0;
                }
            }

            System.out.println("Work done.. program ended...");
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}

public class SecondLargestNum extends Thread{
    public static void main(String[] args) throws InterruptedException{
        
        Thread.sleep(6000);
        FindingSecondLargestNum obj = new FindingSecondLargestNum();
        obj.tmp();
        Thread obj2 = new Thread(obj);
        System.out.println("Program starts..");
        System.out.println(obj2.getState());
        obj2.start();
        System.out.println(obj2.getState());
        
        obj2.join();
        System.out.println(obj2.getState());
    }
}
