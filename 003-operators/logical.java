import java.util.Scanner;

public class logical{
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("Enter num1: ");
        num1 = s.nextInt();

        System.out.print("Enter num2: ");
        num2 = s.nextInt();

        System.out.print("Enter num3: ");
        num3 = s.nextInt();

        System.out.println("Logical AND operator:"+ (num1 > num2 && num1>18)); // return true when both conditions are true
        System.out.println("Logical OR operator:"+ (num1 > num2 || num2<num3)); //return true when any one condition is true

        
        
    }
}