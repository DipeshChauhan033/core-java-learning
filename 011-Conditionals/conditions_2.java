import java.util.Scanner;

public class conditions_2{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter month: ");
        int month = sc.nextInt();
        if(month == 2){
            System.out.print("Enter Year: ");
            int year = sc.nextInt();
            if(year%4 == 0){
                System.out.printf("%d month has 29 days",month);
                System.out.println();
            }
            else{
                System.out.printf("%d month has 28 days",month);
            }
        }
        else if(month == 4 || month == 6 || month == 9 || month == 11){
            System.out.printf("%d month has 30 days",month);
        }
        else{
            System.out.printf("%d month has 31 days",month);
        }

    }
}