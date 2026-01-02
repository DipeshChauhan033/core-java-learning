import java.util.Scanner;


// Using constructor
class calc{
    double num1;
    double num2;

    calc(double n1,double n2){
        num1 = n1;
        num2 = n2;
    }

    double addition(){
        return num1+num2;
    }

    double subtraction(){
        return num1-num2;
    }

    double multiplication(){
        return num1*num2;
    }

    double division(){
        return num1/num2;
    }

}

public class p2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        calc obj = new calc(num1,num2);
        System.out.println("Addition: "+obj.addition());
        System.out.println("Subtraction: "+obj.subtraction());
        System.out.println("Multiplication: "+obj.multiplication());
        System.out.println("Division: "+obj.division());

    }
}