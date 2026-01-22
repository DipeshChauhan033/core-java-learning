import java.util.Scanner;

interface Uname{
    void username(String uname);
}

interface Pass{
    void password(int pass);
}

class Another{
    String s;

    public void throughOther(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Facebook to login with Facebook\nEnter Gmail to login with Gmail\nEnter None to login with uname&pass :");
        s = sc.nextLine().toUpperCase();

        if(s.equals("FACEBOOK")){
            System.out.println("Login done with facebook");
        }
        else if(s.equals("GMAIL")){
            System.out.println("Login done with Gmail");
        }
        else{
            Uname obj = new Display();
            obj.username("Hopper");

            Pass obj1 = new Display();
            obj1.password(123456);
        } 
    }
}

class Display extends Another implements Uname,Pass{
    
    public void username(String uname){
        System.out.println("Username: "+uname);
    }

    public void password(int pass){
        System.out.println("Password: "+pass);
    }

    void System(){
        super.throughOther();
    }

}

public class Login{
    public static void main(String[] args){
        Display obj = new Display();
        obj.System();
        
    }
}