import java.util.Scanner;
 
final class basicDetails{
    String name,education;

    void store(String n,String e){
        name = n;
        education = e;
    }

    void dis(){
        System.out.println("Hello my name is: "+name+" ,and education: "+education);
        System.out.println();
    }
}

class intro extends basicDetails{  // error: cannot inherit from final basicDetails
    void dis(){
        basicDetails bd = new basicDetails();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String str1 = sc.nextLine();

        System.out.print("Enter Education: ");
        String str2 = sc.nextLine();

        bd.store(str1,str2);
        bd.dis();
        System.out.print("In my free time, I enjoy reading books, listening to music, and playing cricket. I am interested in technology and I want to improve my skills every day. My goal is to become a successful professional and make my family proud.");
    }
}

public class FinalAtClass{
    public static void main(String[] args){
        intro obj = new intro();
        obj.dis();
    }
}