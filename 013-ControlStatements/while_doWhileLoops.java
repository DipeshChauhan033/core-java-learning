/**
 * Write a program to print natural numbers.S
 */

import java.util.*;

public class while_doWhileLoops{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to start: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number to stop: ");
        int num2 = sc.nextInt();

        int temp = num1;
        while(temp<=num2){

            System.out.print(temp+" ");
            temp++;
            
        }
        System.out.println("");

        /*
        write a program to print first n natural numbers using do-while loop.
         */

        int num3 = 0;
        System.out.print("Enter n number: ");
        int n = sc.nextInt();

        do{
            num3++;
            System.out.print(num3+" ");
        }while(num3 < n);
        
    }
}