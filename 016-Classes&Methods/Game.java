import java.util.*;

class RockPaperScissor{
    String uinput;
    int rno;
    String[] arr = new String[3];
    public RockPaperScissor(String uinput){
        this.uinput = uinput;
    }

    void dis(){
        Random r = new Random();
        rno = r.nextInt(3);
        arr[0] = "ROCK";
        arr[1] = "PAPER";
        arr[2] = "SCISSOR";

        if(uinput.equals(arr[rno])){
            System.out.println();
            System.out.printf("User choose %s",uinput);
            System.out.println();
            System.out.printf("Computer choose %s",arr[rno]);
            System.out.println();
            System.out.println("Tie...");
        }
        if(uinput.equals("ROCK") && arr[rno].equals("PAPER")){
            System.out.println("User input is ROCK");
            System.out.println("Computer Choose PAPER");
            System.out.println("Computer win...");
        }
        else if(uinput.equals("PAPER") && arr[rno].equals("ROCK")){
            System.out.println("User input is PAPER");
            System.out.println("Computer Choose ROCk");
            System.out.println("User win..");
        }
        else if(uinput.equals("ROCK") && arr[rno].equals("SCISSOR")){
            System.out.println("User input is ROCK");
            System.out.println("Computer Choose SCISSOR");
            System.out.println("User win..");
        }
        else if(uinput.equals("SCISSOR") && arr[rno].equals("ROCK")){
            System.out.println("User input is SCISSOR");
            System.out.println("Computer Choose ROCK");
            System.out.println("Computer win..");
        }
        else if(uinput.equals("PAPER") && arr[rno].equals("SCISSOR")){
            System.out.println("User input is PAPER");
            System.out.println("Computer Choose SCISSOR");
            System.out.println("Computer win..");
        }
        else if(uinput.equals("SCISSOR") && arr[rno].equals("PAPER")){
            System.out.println("User input is SCISSOR");
            System.out.println("Computer Choose PAPER");
            System.out.println("User win..");
        }
        
    }
    
}

public class Game{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while(i!=0){
            System.out.print("Enter ROCK/PAPER/SCISSOR: ");
            String s = sc.nextLine();
            String s2 = s.toUpperCase();
            RockPaperScissor obj = new RockPaperScissor(s2);
            if(s2.equals("ROCK") || s2.equals("PAPER") || s2.equals("SCISSOR")){
                obj.dis();
            }else{
                System.out.println("Invalid Input");
                break;
            }
            System.out.println();
            System.out.print("Enter 1 to restart...\nEnter 2 to stop.. :");
            int choice = sc.nextInt();
            sc.nextLine();
            if(choice==1){
                System.out.println();
                continue;
                
            }
            else if(choice==2){
                System.out.println("Game Stoped...");
                break;
            }
            else{
                System.out.println("Please enter right input..");
            }
        }
    }
}