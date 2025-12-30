import java.util.*;

public class patterns{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1 for (Half star pyramid pattern)\nEnter 2 for (Inverted Half star pyramid pattern)\nEnter 3 for (Star pyramid pattern)\nEnter 4 for (Full star diamond pattern) : ");
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

                for(int i=1;i<=5;i++){
                    for(int j=0;j<i;j++){
                        System.out.print("*");
                    }
                        for(int k=j;k<5;k++){
                            System.out.print(" ");
                        }
                        
                System.out.println("");
                }

        }
    }
}