import java.util.Scanner;

interface payments{
    void CreditCardPayment(int p);
    void UpiPayment(int p);
    void NetBanking(int p);

}

class PaymentThrough implements payments{
    static int balance = 50000;

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
        
        int tmp = 0;
        while(tmp!=1){
            System.out.print("Enter 1 to transfer amount by CreditCard\nEnter 2 to transfer amount by UpiPayment\nEnter 3 to transfer amount by NetBanking\nEnter 4 to check bankbalance:");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter amount to tranfer: ");
                    int a1 = sc.nextInt();
                    obj.CreditCardPayment(a1);
                    break;
                
                case 2:
                    System.out.print("Enter amount to tranfer: ");
                    int a2 = sc.nextInt();
                    obj.UpiPayment(a2);
                    break;

                case 3:
                    System.out.print("Enter amount to tranfer: ");
                    int a3 = sc.nextInt();
                    obj.NetBanking(a3);
                    break;

                case 4:
                    PaymentThrough obj2 = new PaymentThrough();
                    System.out.println("Bank Balance:"+obj2.balance);
            }
        }
    }
}