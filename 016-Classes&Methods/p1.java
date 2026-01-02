import java.util.Scanner;

class calc{
    //Without using constructor
    
    double addition(double num1,double num2){
        return num1+num2;
    }
    double subtraction(double num1,double num2){
        return num1-num2;
    }
    double multiplication(double num1,double num2){
        return num1*num2;
    }
    double division(double num1,double num2){
        return num1/num2;
    }
}

public class p1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        calc obj = new calc();
        System.out.println("Addition: "+obj.addition(num1,num2));
        System.out.println("Subtraction: "+obj.subtraction(num1,num2));
        System.out.println("Multiplication: "+obj.multiplication(num1,num2));
        System.out.println("Division: "+obj.division(num1,num2));
    }
}