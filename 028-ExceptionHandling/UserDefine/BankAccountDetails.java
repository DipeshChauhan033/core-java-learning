package UserDefine;

public class BankAccountDetails{
    public static double balance = 25000;


    public void withdraw(double amount) throws InsufficientBalanceException{
        if(amount>balance){
            throw new InsufficientBalanceException("Amount is more than your balance!..");
        }
        else{
            balance-=amount;
        }
        
    }
}