public class TryCatchP1{

    public static int devide(int a, int b){
        try{
            return a/b;
        }
        catch(ArithmeticException e){
            System.out.println("Number can't devide by zero");
            return -1;
        }
    }

    public static void main(String[] args){
        
        try{
        int[] arr1 = {10,40,60,80,90};
        int[] arr2 = {1,2,0,4};

        for(int i=0;i<arr1.length;i++){
            System.out.println(devide(arr1[i],arr2[i]));
        }
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Index out of bound");
        }

    }
}