import java.util.Scanner;

interface payments{
    void CreditCardPayment(int p);
    void UpiPayment(int p);
    void NetBanking(int p);

}

class PaymentThrough implements payments{
     int balance = 50000;

    public void CreditCardPayment(int p){
        balance = balance-p;
        System.out.println("Payment done through CreditCard now total balance is:"+(balance));
    }

    public void UpiPayment(int p){
        balance = balance-p;
        System.out.println("Payment done through UPI now total balance is:"+(balance));
    }

    public void NetBanking(int p){
        balance = balance-p;
        System.out.println("Payment done through NetBanking now total balance is:"+(balance));
    }
}

public class PaymentGateway{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println();
        payments obj = new PaymentThrough();
        obj.CreditCardPayment();
        obj.UpiPayment();
        obj.NetBanking()
    }
}