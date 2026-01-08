import java.util.Scanner;

public class OddEven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number to check even or odd: ");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("Entered number is even");
        }
        else{
            System.out.println("Entered number is odd");
        }
    }
}