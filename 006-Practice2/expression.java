/**
 * What will be the result of the following expression 
 * float a = 7/4 * 9/2
 */

public class expression{
    public static void main(String[] args){

        float a = 7/4*9/2;
        float b = 7/4.0f * 9/2.0f;

        System.out.println("Output of the Expression :"+a);
        
        System.out.println("Output of the Actual Float Expression : "+b);
    }
}