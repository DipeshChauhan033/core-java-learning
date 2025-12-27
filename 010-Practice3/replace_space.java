import java.util.Scanner;

public class replace_space{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        String str2 = str.replace(" ","_");

        System.out.print(str2);
        
    }
}