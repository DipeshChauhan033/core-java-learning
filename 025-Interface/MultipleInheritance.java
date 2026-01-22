import java.util.Scanner;

interface AreaOfCircle{
    void result1(double r);
}

interface AreaOfRectangle{
    void result2(double l,double b);
}

class Dis implements AreaOfCircle,AreaOfRectangle{
    public void result1(double r){
        System.out.println("Area of circle: "+3.14*r*r);
    }

    public void result2(double l,double b){
        System.out.println("Area of rectangle: "+l*b);
    }
}

class MultipleInheritance{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        Dis obj = new Dis();
        obj.result1(r); 
        obj.result2(5,5);        //OR

        AreaOfCircle obj2 = new Dis();
        obj2.result1(r);

        AreaOfRectangle obj3 = new Dis();
        obj3.result2(5,5);

        
    }
}