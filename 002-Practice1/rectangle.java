import java.util.Scanner;

public class rectangle{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        // Area of rectangle
        System.out.print("Enter length: ");
        float length = s.nextFloat();

        System.out.print("Enter width: ");
        float width = s.nextFloat();

        double area_of_rectangle = length*width;
        System.out.println("Area of rectangle: "+ area_of_rectangle);

        //Perimeter of Rectangle
        System.out.print("Enter length: ");
        length = s.nextFloat();

        System.out.print("Enter width: ");
        width = s.nextFloat();

        double perimeter_of_rectangle = 2*(length+width);
        System.out.println("Perimeter of rectangle: "+ perimeter_of_rectangle);
    }
}