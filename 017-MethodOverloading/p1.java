import java.util.*;

class FindVolume{
    
    static void volume(double side){
        System.out.println("volume of Cube: "+(side*side*side));
    }

    static void volume(double l,double b,double h){
        System.out.println("volume of Cuboid: "+(l*b*h));
    }

    static void volume(double r, double h){
        System.out.println("volume of Cylinder: "+(3.14*r*r*h));
    }
}

public class p1{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter 1 for volume of Cube \nEnter 2 for volume of Cuboid \nEnter 3 for volume of Cylinder: ");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.print("Enter side: ");
                double side = sc.nextDouble();
                FindVolume.volume(side);
                break;

            case 2:
                System.out.print("Enter length: ");
                double l = sc.nextDouble();

                System.out.print("Enter breadth: ");
                double b = sc.nextDouble();

                System.out.print("Enter height: ");
                double h = sc.nextDouble();

                FindVolume.volume(l,b,h);
                break;

            case 3:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();

                System.out.print("Enter height: ");
                double h2 = sc.nextDouble();
                FindVolume.volume(r,h2);
                break;
        }
    
    
    }
}