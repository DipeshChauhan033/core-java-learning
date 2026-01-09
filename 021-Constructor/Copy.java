import java.util.Scanner;

class Employee{
    String name;
    int id;
    Employee(String name,int id){
        this.name = name;
        this.id = id;
    }

    Employee(Employee E,int salary){
            System.out.print("Salary is: "+salary);
    }

    void dis(){
        System.out.println("Employee name is: "+name);
        System.out.println("Employee id is: "+id);
    }
}

public class Copy{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String s = sc.nextLine();

        System.out.print("Enter Employee Id: ");
        int i = sc.nextInt();

        System.out.print("Enter Employee Salary: ");
        int sl = sc.nextInt();

        Employee obj = new Employee(s,i);
        obj.dis();

        Employee obj2 = new Employee(obj,sl);
    }
}