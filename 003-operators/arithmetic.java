import java.util.Scanner;

public class arithmetic{
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int num1, num2;

        System.out.print("Enter first number: ");
        num1 = s.nextInt();

        System.out.print("Enter second number: ");
        num2 = s.nextInt();

        System.out.println("Addition: "+(num1+num2));  
        System.out.println("Subtraction: "+(num1-num2));   
        System.out.println("Multiplication: "+(num1*num2));   
        System.out.println("Division: "+(num1/num2));   
        System.out.println("Modulus: "+(num1%num2));  
        System.out.println("order rules: "+(5*num1+60/num2));
        System.out.println(""); 

        System.out.println("Num1 before Increment: "+(num1));  
        System.out.println("Num2 Before Decrement: "+(num2));  
        
        num1++; 
        num2--;

        System.out.println("Num1 After Increment: "+(num1));   
        System.out.println("Num2 After Decrement: "+(num2));  
    }
}