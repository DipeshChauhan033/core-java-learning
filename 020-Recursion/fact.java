import java.util.Scanner;
class recursionTest{

    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
}

public class fact{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n number: ");
        int n = sc.nextInt();

        System.out.printf("Factorial till %d: "+recursionTest.factorial(n),n);
    }
}