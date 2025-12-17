import java.util.Scanner;

public class circumference_of_circle{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        float r = s.nextFloat();

        double calculate = 2*3.14*r;

        System.out.println("circumference_of_circle: "+calculate);
    }
}