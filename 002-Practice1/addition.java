import java.util.Scanner;

public class addition{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num1,num2,num3;

        

        System.out.print("Enter Frist Number: ");
        num1 = s.nextInt();
        System.out.print("Enter Second Number: ");
        num2 = s.nextInt();
        System.out.print("Enter Third Number: ");
        num3 = s.nextInt();

        System.out.println("Sum: "+ (num1+num2+num3));

        s.nextLine();

        System.out.print("Enter Name: ");
        int name = s.nextInt();
        String str = String.valueOf(name);
        System.out.println("It is String: "+(str+num1+num2)); // joins not add
        
    }
}