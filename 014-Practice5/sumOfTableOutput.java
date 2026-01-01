import java.util.Scanner;

public class sumOfTableOutput{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n number to wants generate that multiplication table: ");
        int n = sc.nextInt();

        int temp = 0;
        
        for(int i=1;i<=10;i++){
            temp = temp+(n*i);
        }
        System.out.printf("Sum of %d Table's output: "+temp,n);
    }
}