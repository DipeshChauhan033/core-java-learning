/**
 * Use comarison operators to find out whether a given number is
 * grater than the user entered number or not
 */

import java.util.Scanner;

public class comparison{
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.print("Enter 1st Number: ");
        int num1 = s.nextInt();

        System.out.print("Enter 2nd Number: ");
        int num2 = s.nextInt();

        String result = (num1>num2)?"num1 is graterthan num2"
        :(num1<num2)?"num1 is lessthan num2"
        :"both inputs are same";

        System.out.println("Ouput is: "+ result);
    

    }
}