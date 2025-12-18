import java.util.Scanner;

public class bitwise{
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int num1, num2;

        System.out.print("Enter first number: ");
        num1 = s.nextInt();

        System.out.print("Enter second number: ");
        num2 = s.nextInt();

        System.out.println("After Performing &: "+(num1 & num2));

        /* let num1 = 11, num2 = 12
                binary of num1(11) : 1011
                binary of num2(12) : 1100
                                    ------
                    Solve with &:    1000   -> decimmal: 8
        */
            
        System.out.println("After Performing |: "+(num1 | num2));

        /* let num1 = 11, num2 = 12
                binary of num1(11) : 1011
                binary of num2(12) : 1100
                                    ------
                    Solve with |:    1111   -> decimmal: 15
        */

       System.out.println("After Performing ^(XOR): "+(num1^num2));

       /* let num1 = 11, num2 = 12
                binary of num1(11) : 1011
                binary of num2(12) : 1100
                                    ------
                Solve with ^(XOR):   0111  -> decimmal: 7
        */

       System.out.println("Left shift: "+(num1<<num2));

       /* num1 * 2^num2
            let num1 = 11, num2 = 5
            --> 11*2^5 = 352
        */

       System.out.println("Right shift: "+(num1>>num2));

        /* num1/ 2^num2
            let num1 = 20, num2 = 5
            --> 64/2^5 = 2
        */

       System.out.println("Zero fill Right shift: "+(num1>>>num2));
    }

}