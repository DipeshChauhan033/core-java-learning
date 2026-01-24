/**
 * Multiple catch
 */

class InitializeArr{
    String s;
    public InitializeArr(String s){
        this.s=s;
    }
    public void operations(){
        int[] arr1 = {10,40,30,120,200};
        int[] arr2 = {1,2,0,4,5};

          
        for(int i=0;i<arr1.length;i++){
            try{
                System.out.println(arr1[i]/arr2[i]);
            }
            catch(IndexOutOfBoundsException e){
                System.out.println("Fifth position is not define- index out of bound");
             }
            catch(ArithmeticException e){
                System.out.printf("%d not devided by 0%n",arr1[i]);
             }
        }
        System.out.println("Division completed :)");
        
        
    }
}

public class TryCatchP2{
    public static void main(String[] args){
        InitializeArr obj = new InitializeArr("d");
        obj.operations();
    }
}