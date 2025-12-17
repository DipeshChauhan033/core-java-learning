import java.util.Scanner;

public class kilometer_to_miles{
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.print("Enter kilometers: ");
        int k = s.nextInt();

        double cal = k/1.609;
        System.out.println("Miles: "+cal);
    }
}