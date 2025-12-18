import java.util.Scanner;

public class relational{
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int num1, num2;

        System.out.print("Enter num1: ");
        num1 = s.nextInt();

        System.out.print("Enter num2: ");
        num2 = s.nextInt();

        System.out.println("num1 "+num1+" is equals to num2 "+num2+"? : "+(num1==num2));
        System.out.println("num1 "+num1+" is not equals to num2 "+num2+"? : "+(num1 != num2));
        System.out.println("num1 "+num1+" is grater than to num2 "+num2+"? : "+(num1 > num2));
        System.out.println("num1 "+num1+" is less than to num2 "+num2+"? : "+(num1 < num2));
        System.out.println("num1 "+num1+" is greater than equal to num2 "+num2+"? : "+(num1 >= num2));
        System.out.println("num1 "+num1+" is less than equal to "+num2+"? : "+(num1 <= num2));
    }
}
