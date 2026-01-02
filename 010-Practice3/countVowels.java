import java.util.Scanner;
public class countVowels{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String[] arr = {"A","E","I","O","U"};

        System.out.print("Enter String: ");
        String str = sc.nextLine();     
        
        String str2 = str.toUpperCase();

        int count = 0;
        for(int i=0;i<5;i++){
            if(str2.contains(arr[i])){
                count+=1;
            }
            else{
                continue;
            }
        }System.out.printf("String \"%s\" contains total %d vowels" ,str2,count);
        

        
        
    }
}