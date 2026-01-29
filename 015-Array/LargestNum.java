public class LargestNum{
    public static void main(String[] args){
        int[] arr = {30,51,540,34,11,46,130};

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
