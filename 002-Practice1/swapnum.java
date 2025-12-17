import java.util.Scanner;

public class swapnum{
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        int num1,num2,num3,num4,tmp;

        System.out.print("Enter num for variable num1: ");
        num1 = s.nextInt();

        System.out.print("Enter num for variable num2: ");
        num2 = s.nextInt();

        System.out.println("Before Swampping num1 is: "+num1);
        System.out.println("Before Swampping num2 is: "+num2);

        System.out.println("");

        tmp = num1;
        num1 = num2;
        num2 = tmp;
        
        System.out.println("After Swampping num1 is: "+num1);
        System.out.println("After Swampping num2 is: "+num2);

        System.out.println("");

        //Second Method (Without tmp variable)
        System.out.print("Enter num for variable num3: ");
        num3 = s.nextInt();

        System.out.print("Enter num for variable num4: ");
        num4 = s.nextInt();

        System.out.println("Before Swampping num3 is: "+num3);
        System.out.println("Before Swampping num4 is: "+num4);

        System.out.println("");

        num3 = num3+num4;
        num4 = num3-num4;
        num3 = num3-num4;

        System.out.println("After Swampping num3 is: "+num3);
        System.out.println("After Swampping num4 is: "+num4);

    }
}