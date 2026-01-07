import java.util.Scanner;

class Employee{
    String Ename;
    int Eid;
    Scanner sc = new Scanner(System.in);
    Employee(){
        System.out.print("Enter Employee Name: ");
        Ename = sc.nextLine();

        System.out.print("Enter Employee Id: ");
        Eid = sc.nextInt();
        sc.nextLine();
        System.out.println("Employee Name & Id is: "+Ename+" ,"+Eid);
    }
}

class DeveloperTypes extends Employee{
    String type;
    DeveloperTypes(){
        System.out.print("Enter Developer Type: ");
        type = sc.nextLine();
        if(type.equals("frontend")){
            System.out.println("He is Frontend Developer");
        }
        else if(type.equals("backend")){
            System.out.println("He is backend Developer");
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}

class SalaryCalculate extends DeveloperTypes{
    double salary = 0;
    SalaryCalculate(){
        if(type.equals("frontend")){
            salary+=10000;
        }
        else if(type.equals("backend")){
            salary+=16000;
        }
    System.out.printf("Salary of %s is: "+salary,Ename);
    }
}

public class MultilevelInheritance{
    public static void main(String[] args){
        SalaryCalculate obj = new SalaryCalculate();
    }
}