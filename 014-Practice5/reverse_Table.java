import java.util.*;

public class reverse_Table{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n number for generate that table in reverse order: ");
        int n = sc.nextInt();

        for(int i=10;i>=1;i--){
            System.out.println(n+"*"+i+":"+(n*i));
        }
    }
}