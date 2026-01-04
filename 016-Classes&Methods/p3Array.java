import java.util.Scanner;

class changeArray{

    static void change(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element: ");
        int input = sc.nextInt();
        arr[0] = input;
    }
}

public class p3Array{
    public static void main(String[] args){
        int[] arr2 = {10,15,20,25};
        changeArray.change(arr2);

        System.out.println("Array element changed: "+arr2[0]);

        System.out.println("Array Elements: ");
        for(int dis : arr2){
            System.out.print(dis+" ");
        }
    }
}