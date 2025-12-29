import java.util.*;

public class CheckTypesOfWeb{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter website url/link: ");
        String link = sc.nextLine();

        if(link.endsWith(".com")){
            System.out.println("This is a commercial website");
        }
        else if(link.endsWith(".org")){
            System.out.println("This is a organizational website");
        }
        else if(link.endsWith(".in")){
            System.out.println("This is a indian website");
        }
    }
}