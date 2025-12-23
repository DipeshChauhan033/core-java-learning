import java.util.Scanner;

public class StringBufferTest{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // simple string
        System.out.print("Enter first name: ");
        String str1 = sc.nextLine();

        System.out.print("Enter last name to joint with first name: ");
        String str2 = sc.nextLine();

        str1.concat(str2);

        System.out.println("output form str1 varible (using simple string class): "+str1);

        //StringBuffer class

        System.out.println("After using StringBuffer class..");

        System.out.print("Enter first name: ");
        String str3 = sc.nextLine();
        StringBuffer str4 = new StringBuffer(str3);

        System.out.print("Enter last name to joint with first name: ");
        String str5 = sc.nextLine();
        
        str4.append(str5);

        System.out.println("output form str3 varible (using string buffer class): "+str4);

    }
}