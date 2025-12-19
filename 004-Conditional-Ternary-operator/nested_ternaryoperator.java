import java.util.Scanner;

public class nested_ternaryoperator{
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.print("Enter test marks: ");
        int marks = s.nextInt();

        String result = (marks >= 90)? "A+"
        :(marks >=80 && marks<90) ? "A"
        :(marks >= 70 && marks<80) ? "B"
        :(marks >50 && marks<70)? "C"
        :"D";

        System.out.println("Result Grad: "+ result);

        String newresult = (result == "A+")?"Excellent"
        :(result == "A")? "Very Good"
        :(result == "B")? "Good"
        :"Not bad";
        System.out.println("Acknowledging: "+ newresult);

    }
}