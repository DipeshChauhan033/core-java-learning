package UserDefine;
import java.util.*;

public class Withdraw{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to withdraw: ");
        double a = sc.nextInt();
        BankAccountDetails obj = new BankAccountDetails();

        try{
            obj.withdraw(a);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Balance is: "+obj.balance);
       

    }
}