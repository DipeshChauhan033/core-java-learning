public class finallyP1{
    public static void main(String[] args){
        
        try{
            double result = 10/0;
        }
        catch(ArithmeticException e){
            System.out.println("Num can't devide by zero");
        }
        finally{
            System.out.println("this will be always excuted");
        }
    }
}