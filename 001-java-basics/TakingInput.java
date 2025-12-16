import java.util.Scanner;

public class TakingInput{
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        String s1,s2,s3;
        
        System.out.print("Enter First Name: ");
        s1 = s.nextLine();
        System.out.print("Enter Your Middle Name: ");
        s2 = s.nextLine();
        System.out.print("Enter Your Last Name: ");
        s3 = s.nextLine();
        System.out.print("Enetr Your Age: ");
        byte a = s.nextByte();

        System.out.println("Full Name: " + s1 +" " + s2 + " "+ s3);
        System.out.println("Age is: "+ a);

      
        //Check user inputs 
        System.out.print("Check for integer: ");
        boolean b1 = s.hasNextInt();
        System.out.println(b1);
    }
}