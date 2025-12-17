import java.util.Scanner;

public class area_of_triangle{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = s.nextInt();

        System.out.print("Enter height: ");
        int height = s.nextInt();

        double area_of_triangle = 0.5*base*height;

        System.out.println("Area of triangle: "+ area_of_triangle);
    }
}