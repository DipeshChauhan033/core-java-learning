import java.util.Scanner;

abstract class Check{
    abstract void identify(int n);
}

class Done extends Check{
    void identify(int n){
        int[] arr = {1,50,2,100,20,45,200,74,856,121,22,10,22};

        for(int i=0;i<=arr.length-1;i++){
            if(n==arr[i]){
                System.out.printf("%d is present in array",n);
                break;
            }
        }  
    }
}


public class NumPresent{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n number to check it present into array or not: ");
        int n = sc.nextInt();

        Check obj = new Done();
        obj.identify(n);
    }
}