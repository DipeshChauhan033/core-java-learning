import java.util.Scanner;

public class switchcase3{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Your bank balance is: 5000");
        double balance = 5000;
        System.out.print("Now select what you wants?\nEnter deposit to deposit a cash, Enter withdraw to withdraw cash, Enter balance to check bank balance: ");

        String str = sc.nextLine();

        switch(str){
            case "deposit":
                System.out.print("Enter cash amout to deposit:");
                double newbalance = sc.nextDouble();
                balance+=newbalance;
                System.out.println("Cash deposit successfully, now your bank balance is: "+balance);
                break;

            case "withdraw":
                System.out.print("Enter amout you wants to withdraw: ");
                double minusbalance = sc.nextDouble();
                balance-=minusbalance;
                System.out.println("Cash withdraw successfully, now your bank balance is: "+balance);
                break;

            case "balance":
                System.out.println("Bank balance is: "+balance);
                break;
            
            default:
                System.out.println("Invalid Input");
        }


    }
}