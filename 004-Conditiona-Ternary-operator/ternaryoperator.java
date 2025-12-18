import java.util.Scanner;

public class ternaryoperator{
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = s.nextInt();

        System.out.print("Enter second number: ");
        int num2 = s.nextInt();

        int max = (num1>num2)?num1:num2;

        System.out.println("Maximum :"+max);

        //check num1 is even or odd..

        String check = (num1 % 2==0)? "Even":"Odd";
        System.out.println("Num1 is: "+check);


    }
}