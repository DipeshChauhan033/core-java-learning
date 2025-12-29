/**
 * write a program to print first n odd number using a for loop
 */

import java.util.*;

public class forLoop{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n number: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            if(i%2 != 0 ){
                System.out.print(i+" ");
            }
        }

        System.out.println();
        sc.nextLine();
        /*
            write a program to print first n natural numbers in reverse order
        */

       System.out.print("Enter n number in revers: ");
       int n2 = sc.nextInt();

        System.out.print("In reverse: ");
       for(int i=n2;i>=0;i--){
        
            System.out.print(i+" ");
       }
    }
}