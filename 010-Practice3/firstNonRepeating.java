import java.util.Scanner;

public class firstNonRepeating{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        String[] arr =  str.split("");

       for(int i= 0;i<str.length();i++){
        boolean flag = false;
        for(int j=0;j<str.length();j++){
            if(i!=j && arr[i].equals(arr[j])){
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.print("First non repeated character: "+arr[i]);
            break;
        }
       }
        
    }
}