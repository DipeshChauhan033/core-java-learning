import java.util.Scanner;

class Vehicle{
    Scanner sc = new Scanner(System.in);
    String vName;
    int vNumber;
    String vType;

    public Vehicle(){
        System.out.print("Enter vehicle name: ");
        vName = sc.nextLine();
        System.out.print("Enter vehicle number: ");
        vNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter vehicle type: ");
        vType = sc.nextLine();
        System.out.println();

    }
}

class Cars extends Vehicle{
    Cars(){
        System.out.println("Car Details\n: ");
        System.out.println("Vehicle name is: "+vName);
        System.out.println("Vehicle number is: "+vNumber);
        System.out.println("Vehicle type is: "+vType);
        System.out.println();
    }
}

class Truck extends Vehicle{
    Truck(){
        System.out.println("Truck Details : ");
    }
}

class CarFunctionality extends Cars{
    CarFunctionality(){
        System.out.print("car functionality: \n");
    }
    void getFun(String cf){
        System.out.println("Car functionality is: "+cf);
    }
}

public class HybridInheritance{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter 1 for define car details\nEnter 2 for define truck details\n:");
        int choice = sc.nextInt();
        sc.nextLine();

        switch(choice){
            case 1:
                CarFunctionality obj = new CarFunctionality();
                System.out.print("Enter car functionality: ");
                String carfun = sc.nextLine();
                System.out.println();
                obj.getFun(carfun);
                break;

        }
    }
}