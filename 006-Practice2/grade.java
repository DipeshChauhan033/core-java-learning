/**
 * Write a java program to encrypt a grade by adding 8 to it.
 * decrypt it to show the correct grade.
 */


public class grade{
    public static void main(String[] args){
        char grade = 'A';
        grade = (char)(grade + 8);
        System.out.println("Your Grade is: "+grade);

        //Decrypting the grade

        grade = (char)(grade - 8);
        System.out.println("Your Actual Grade: "+grade);
    }
}