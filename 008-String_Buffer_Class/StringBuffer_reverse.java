import java.util.Scanner;

public class StringBuffer_reverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str1 = sc.nextLine();

        StringBuffer str2 = new StringBuffer(str1);
        
        str2.reverse();

        System.out.println("Reverse String: "+str2);

    }
}