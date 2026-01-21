import java.util.*;

class ThreeNoInDESC{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number1: ");
        int a = sc.nextInt();
        System.out.print("Enter Number2: ");
        int b = sc.nextInt();
        System.out.print("Enter Number3: ");
        int c = sc.nextInt();

        for(int i=0;i<1;i++){
            if(a>b && a>c){
                System.out.println(a);
            }
            else if(b>c){
                System.out.println(b);
            }
            else{