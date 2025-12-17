import java.util.Scanner;

public class marksheet{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter marks of maths sub: ");
        float maths = s.nextFloat();
        System.out.print("Enter marks of Social Science sub: ");
        float ss = s.nextFloat();
        System.out.print("Enter marks of Science sub: ");
        float science = s.nextFloat();
        System.out.print("Enter marks of English sub: ");
        float english = s.nextFloat();
        System.out.print("Enter marks of Hindi sub: ");
        float hindi = s.nextFloat();
        System.out.print("Enter marks of Gujrati sub: ");
        float gujrati = s.nextFloat();

        float percentage = ((maths+ss+science+english+hindi+gujrati)*100)/600;
        System.out.println("Percentage: "+percentage);
    }
}