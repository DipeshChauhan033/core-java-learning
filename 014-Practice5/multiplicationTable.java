import java.util.Scanner;

public class multiplicationTable{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n number to wants generate that multiplication table: ");
        int n = sc.nextInt();

        System.out.printf("%d Table: ",n);
        System.out.println();


        int temp = 1;
        
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+" :"+(n*i));
        }
    }
}
