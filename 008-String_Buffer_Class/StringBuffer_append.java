import java.util.Scanner;

public class StringBuffer_append{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        StringBuffer str1 = new StringBuffer("Hello ");

        System.out.print("Enter your name: ");
        String str2 = sc.nextLine();
        StringBuffer str3 = new StringBuffer(str2);

        StringBuffer str4 = new StringBuffer(", How are You!");

        str1.append(str3);

        str1.append(str4);

        System.out.println(str1);

    }
}