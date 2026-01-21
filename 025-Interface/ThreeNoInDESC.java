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

        System.out.println("Numbers in Descending order: ");
        for(int i=0;i<1;i++){
            if(a>b && a>c){
                System.out.println(a);
            }
            else if(b>c){
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }
                       
            for(int j=0;j<1;j++){
                if((a>b && a<c) || (a<b && a>c)){
                    System.out.println(a);
                }
                else if((b>a && b<c) || (b<a && b>c)){
                    System.out.println(b);
                }
                else if((c>a && c<b) || (c<a && c>b)){
                    System.out.println(c);
                }

                for(int k=0;k<1;k++){
                    if(a<b && a<c){
                        System.out.println(a);
                    }
                    else if(b<c){
                        System.out.println(b);
                     }
                    else{
                        System.out.println(c);
                    }
                }

            }
        }

        
    }
}