import java.util.Scanner;

public class sumNEvenNum{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N number: ");
        long n = sc.nextLong();

        long temp = 0;
        for(long i=1;i<=n;i++){
            if(i%2==0){
                temp = temp+i;
            }
            continue;
        }
        System.out.printf("Sum of even num till %d: "+temp,n);
    }
}