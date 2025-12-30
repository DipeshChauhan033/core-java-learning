import java.util.*;

public class patterns{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1 for (Half star pyramid pattern)\nEnter 2 for (Inverted Half star pyramid pattern)\nEnter 3 for (Opposite half star pyramid pattern)\nEnter 4 for (Opposite inverted Half star pyramid pattern) : ");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.print("Enter n number: ");
                int n1 = sc.nextInt();

                for(int i=1;i<=n1;i++){
                    for(int j=0;j<i;j++){
                        System.out.print("*"+" ");
                    }
                    System.out.println("");
                 }
                 break;
            
            case 2:
                System.out.print("Enter n number: ");
                int n2 = sc.nextInt();

                for(int i=1;i<=n2;i++){
                    for(int j=n2;j>=i;j--){
                        System.out.print("*"+" ");
                    }
                    System.out.println("");
                }
            
            case 3:
                System.out.print("Enter n number: ");
                int n3 = sc.nextInt();

                for(int i=1;i<=n3;i++){
                    for(int j=n3;j>i;j--){
                        System.out.print(" ");
                    }
                    for(int k=0;k<i;k++){
                        System.out.print("*"); 
                        
                    }   
                System.out.println("");
                }

            case 4:
                System.out.print("Enter n number: ");
                int n4 = sc.nextInt();

                for(int i=1;i<=n4;i++){
                    for(int j=n4;j>=i;j--){
                        System.out.print("*");
                    }
                    System.out.println("");
                    for(int k=0;k<i;k++){
                        System.out.print(" "); 
                        
                    }   
                
                }


        }
    }
}