import java.util.Scanner;

class Result{
    public String standards(String msg){  //Differentiate by return type
        return msg;
    }

    public double standards(double maths,double science,double english,double gujrati){
        return ((maths+science+english+gujrati)*100)/400;
    }

    public double standards(double maths,double science,double english,double socialscience,double gujrati){
        return ((maths+science+english+socialscience+gujrati)*100)/500;
    }

    public double standards(double maths,double science,double english,double socialscience,double gujrati,double hindi){
        return ((maths+science+english+socialscience+gujrati+hindi)*100)/600;
    }

}

public class MethodOverloading{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Msg: ");
        String msg = sc.nextLine();
        Result obj1 = new Result();
        System.out.println("***"+obj1.standards(msg)+"***");

        System.out.println("result of standard4 student: "+obj1.standards(70.4,90.99,92.0,77));
        System.out.println("result of standard5 student: "+obj1.standards(70.4,90.99,92.0,77,96.23));
        System.out.println("result of standard6 student: "+obj1.standards(70.4,90.99,92.0,77+96.23,60));
        
    }
}

