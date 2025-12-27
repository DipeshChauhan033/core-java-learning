import java.util.Scanner;

public class palindrome{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string : ");
        String str = sc.nextLine();

        StringBuffer str2 = new StringBuffer(str);
        

        str2.reverse();
        String str3 = str2.toString();
        
        String temp = (str3.equals(str))?"String is palindrome":"String is not palindrome";

        System.out.println(temp);
    }
}