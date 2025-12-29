import java.util.Scanner;

public class conditions_3{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Signal: ");
        String str = sc.nextLine();
        
        if(str.equals("green")){
            System.out.println("You may move now");
        }
        else if(str.equals("red")){
            System.out.println("STOP – Vehicles must halt");
        }
        else if(str.equals("yellow")){
            System.out.println("WAIT – Get ready to stop");
        }
        else{
            System.out.println("Invalid signal");
        }
    }
}