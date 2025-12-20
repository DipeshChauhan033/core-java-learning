import java.util.Scanner;

public class basic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String s = sc.nextLine();

        System.out.println("Hello "+s+" How are you?"); 
        System.out.printf("Hello %s how are you?",s); 
        System.out.println(); //For gape
        System.out.format("Hello %s how are you?",s);
        System.out.println(); //For gape

        String s2 = new String("Hello world");
        System.out.println("Using object : "+s2);

        System.out.print("Enter your name to vote: ");
        String s3 = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        String s4 = (age >= 18)?"Eligible":"Not Eligible";

        System.out.printf("Hello %s your are %s to vote because your age is %d",s3,s4,age);
    }
}