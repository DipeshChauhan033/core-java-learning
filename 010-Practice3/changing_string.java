import java.util.Scanner;

public class changing_string{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String str = sc.nextLine();

        System.out.printf("Dear %s, thanks a lot",str);
        System.out.println();

        System.out.print("Enter name to replce: ");
        String str3 = sc.nextLine();
        String str4 = str.replace(str,str3);
        System.out.printf("Dear %s, thanks a lot",str4);
        

    }
}