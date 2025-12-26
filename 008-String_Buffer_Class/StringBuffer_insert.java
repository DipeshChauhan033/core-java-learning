import java.util.Scanner;

public class StringBuffer_insert{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        /*
            1. str.insert(int index, string str)
            2. str.insert(int index, int num)
            3. str.insert(int num, object obj)
        */
       System.out.print("Enter string: ");
       String str1 = sc.nextLine();
       StringBuffer str2 = new StringBuffer(str1);

       System.out.println("String before insertion: "+str2);

       System.out.print("Enter index number, when you insert: ");
       int inx = sc.nextInt();

       sc.nextLine();

       System.out.print("Enter string to insert: ");
       String str3 = sc.nextLine();
       StringBuffer str4 = new StringBuffer(str3);

       str2.insert(inx,str4);

       System.out.println("String after insertion: "+str2);

    }
}