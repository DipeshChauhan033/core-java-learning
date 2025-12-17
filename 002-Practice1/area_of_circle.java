import java.util.Scanner;

public class area_of_circle{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        float r = s.nextFloat();

        double area_of_circle = 3.14*r*r;

        System.out.println("Area of Circle: "+area_of_circle);
    }
}