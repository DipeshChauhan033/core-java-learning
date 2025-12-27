import java.util.Scanner;

public class StringBuffer_replace{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str1 = sc.nextLine();

        StringBuffer str2 = new StringBuffer(str1);

        System.out.print("Enter string to replace: ");
        String str3 = sc.nextLine();

        System.out.print("Enter starting index to replace: ");
        int inx1 = sc.nextInt();

        System.out.print("Enter ending index to replace: ");
        int inx2 = sc.nextInt();

         sc.nextLine();
         
        System.out.println("String before replace: "+str2);
        str2.replace(inx1,inx2,str3);

       
        System.out.println("Replaced string: "+str2);

    }
}