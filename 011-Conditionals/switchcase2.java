import java.util.Scanner;

public class switchcase2{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 for addition, Enter 2 for subtraction, Enter 3 for multiplication,\nEnter 4 for division");
        System.out.println();

        System.out.print("Enter Number: ");
        int choice = sc.nextInt();

        System.out.print("Enter number to perform operatons: ");
        int num1 = sc.nextInt();

        System.out.print("Enter number to perform operatons: ");
        int num2 = sc.nextInt();        

        switch(choice){
            case 1:
                System.out.println("Addition: "+(num1+num2));
                break;
            case 2:
                System.out.println("Subtraction: "+(num1-num2));
                break;
            case 3:
                System.out.println("Multiplication: "+(num1*num2));
                break;
            case 4:
                System.out.println("Addition: "+(num1/num2));
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}