import java.util.Scanner;

public class StringBuffer_capacity{
    public static void main(String[] args){

        StringBuffer str1 = new StringBuffer();
        System.out.println(str1.capacity());

        Scanner sc = new Scanner(System.in);

        //ensureCapacity()
        System.out.print("Enter string: ");
        String str2 = sc.nextLine();

        StringBuffer str3 = new StringBuffer(str2);

        str3.ensureCapacity(50);
        System.out.println(str3.capacity());

    }
}