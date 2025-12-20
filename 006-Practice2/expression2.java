/**
 * Write the following expression in a program:
 * v^2 - u^2 / 2as
 */

import java.util.Scanner;
public class expression2{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int v,u,a,s;
        System.out.print("Enter value v: ");
        v = sc.nextInt();

        System.out.print("Enter value u: ");
        u = sc.nextInt();

        System.out.print("Enter value a: ");
        a = sc.nextInt();

        System.out.print("Enter value s: ");
        s = sc.nextInt();

        double expression = ((v*v)-(u*u))/(2*a*s);

        System.out.println("Output of Expression: "+expression);

        System.out.println("Output of 2nd Expression: "+(7*49/7+35/7));

        
    }
}