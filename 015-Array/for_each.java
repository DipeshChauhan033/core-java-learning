import java.util.Scanner;

public class for_each{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        //Entres value from user and store into array
        for(int i=0;i<=size-1;i++){
            System.out.printf("Enter element at index number %d: ",i);
            int ele = sc.nextInt();

            arr[i] = ele;
        }
        
        for(int dis:arr){
            System.out.print(dis+" ");
        }
    }
}