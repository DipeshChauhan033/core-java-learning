public class LargestNum{
    public static void main(String[] args){
        int[] arr = {600,30,50,150,20,602,14,6,2,59,2,0,601,5,9,99,2,22,5,300,450,88,500};

        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    count+=1;
                }
            }
            if(count==arr.length-1){
                System.out.println("Largest num is : "+arr[i]);
                break;
            }
            else{
                count=0;
            }
        }
        
    }
}
