import java.util.Scanner;

class myException extends Exception{
    public myException(String msg){
        super(msg);
    }
}

class Operation{

    public void checkAge() throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();

        if(age<18){
            throw new myException("Age is < 18...");
        }
        else{
            System.out.printf("Your age is elligible to vote..");
        }
    }
}

public class UserDefineException2{
    public static void main(String[] args) throws Exception{
        Operation obj = new Operation();
        obj.checkAge();
    }
}