import java.util.Scanner;

public class conditions{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //Even or odd
        System.out.print("Enter number to check even or odd: ");
        int num1 = sc.nextInt();

        if(num1 %2 == 0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }

        System.out.println();

        //Even or odd (MEthod - 2)
        System.out.print("Enter number to check even or odd (Using another method): ");
        int num2 = sc.nextInt();

        if((num2/2)*2 == num2){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }

        System.out.println();

        //Positive or negative
        System.out.print("Enter number to check positive,negative: ");
        int num3 = sc.nextInt();

        if(num3>0){
            System.out.println("Number is positive");
        }
        else if(num3<0){
            System.out.println("Number is negative");
        }
        else{
            System.out.println("Neither positive or negative");
        }

        System.out.println();

        //FindLargestOfThree
        System.out.print("Enter first number: ");
        int num4 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num5 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num6 = sc.nextInt();

        if(num4>num5){
            if(num4>num6){
                System.out.printf("%d is greater than %d and %d",num4,num5,num6);
            }
        }
        else if(num5>num6){
            System.out.printf("%d is greater than %d and %d",num5,num4,num6);
        }
        else{
            System.out.printf("%d is greater than %d and %d",num6,num4,num5);
        }

        System.out.println();
        System.out.println();
        
        //LeapYear Check
        System.out.print("Enter Year: ");
        int year = sc.nextInt();
        if(year%4 == 0){
            System.out.println("Entered year is leap year");
        }
        else{
            System.out.println("Entered year is not leap year");
        }

    }
}