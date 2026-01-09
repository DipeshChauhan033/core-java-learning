import java.util.Scanner;

class data{
    float pi=3.14f;
    float radius; 
    data(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = sc.nextFloat();
    }
}

class AreaOfCircle extends data{
    void areaofcircle(){
        System.out.println("Area of circle is: "+(pi*radius*radius));
    }
}

public class SingleInheritance{
    public static void main(String[] args){
        AreaOfCircle obj = new AreaOfCircle();
        obj.areaofcircle();
    }
}