/**
 * Nested catch
 */

class InitializeArr{
    String s;
    public InitializeArr(String s){
        this.s=s;
    }
    public void operations(){
        int[] arr1 = {10,40,30,120,200};
        int[] arr2 = {1,2,0,4,5};

        try{
            for(int i=0;i<arr1.length;i++){
                try{
                    System.out.println(arr1[i]/arr2[i]);
                }
                catch(ArithmeticException e){
                    System.out.printf("%d not devided by 0%n",arr1[i]);
                }
            }
            System.out.println("Division completed :)");
            arr1[5] = 100;
        }
        catch(Exception e){
            System.out.println("Index not exist");
        }
        
        
        
    }
}

public class TryCatchP3{
    public static void main(String[] args){
        InitializeArr obj = new InitializeArr("d");
        obj.operations();

        InitializeArr obj2 = null;
        try{
            obj2.operations();
        }
        catch(Exception e){
            System.out.println("Null pointer exception :(");
        }
        
    }
}