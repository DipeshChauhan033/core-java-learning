import java.util.*;

class ThreeNoInDESC{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = 4;
        int b = 3;
        int c = 5;

        int[] arr = new int[3];

        arr[0]=a;
        arr[1]=b;
        arr[2]=c;

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
                if(a>b && a<c){
                    System.out.println(a);
                }
                else if(b>a && b<c){
                    System.out.println(b);
                }
                else if(c>a && c<b){
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