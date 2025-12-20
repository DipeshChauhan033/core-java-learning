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