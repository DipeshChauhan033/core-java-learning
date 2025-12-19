import java.util.Scanner;

public class quickquiz{
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = s.nextInt();
        System.out.print("Enter b: ");
        int b = s.nextInt();
        System.out.print("Enter c: ");
        int c = s.nextInt();

        int ans1 = a - b/2;
        System.out.println("Ans1: "+ans1);

        System.out.println(" ");
        int ans2 = ((b*b)-4*a*c)/2*a;
        System.out.println("Ans2: "+ans2);
        /* b^2-4ac
          --------
             2ac
        */
        System.out.println("");
        System.out.print("Enter v: ");
        int v = s.nextInt();
        System.out.print("Enter u: ");
        int u = s.nextInt();

        int ans3 = (v*v)-(u*u);   //v^2 - u^2
        System.out.println("Ans3: "+ ans3);

        System.out.println();
        System.out.print("Enter d: ");
        int d = s.nextInt();

        int ans4 = a*b-d;
        System.out.println("Ans4: "+ ans4);
    }
}