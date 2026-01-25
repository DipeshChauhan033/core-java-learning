public class finallyP2{
    public static void main(String[] args){
        devide(5,0);
    }

    public static void devide(int a,int b){
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("Cant devide by zero");
        }
        finally{
            if(a==0 || b ==0){
                System.out.println("Enter greterthan 0..");
            }
            System.out.println("Program End");
        }
    }
}