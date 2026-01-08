import java.util.Scanner;

class StudentDetails{
    Scanner sc = new Scanner(System.in);
    String sname,state,city;
    int phone_no;

    StudentDetails(){
        System.out.print("Enter student name: ");
        sname = sc.nextLine();

        System.out.print("Enter state name: ");
        state = sc.nextLine();

        System.out.print("Enter city name: ");
        city = sc.nextLine();

        System.out.print("Enter phone no: ");
        phone_no = sc.nextInt();
        sc.nextLine();

        System.out.println();

    }

    void display(){
        System.out.println("Student Name: "+sname);
        System.out.println("State of Student: "+state);
        System.out.println("City of Student: "+city);
        System.out.println("Student.Phone No: "+phone_no);
        System.out.println();
    }
}

class ScienceStudents extends StudentDetails{
    
    ScienceStudents(){
        display();
        System.out.printf("%s take addmission in Science..",sname);
        System.out.println();
    }
}

class CommerceStudents extends StudentDetails{

    CommerceStudents(){
        display();
        System.out.printf("%s take admission in commerce..",sname);
        System.out.println();
    }
}

public class HierarchicalInheritance{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1 for given admission into science..\nEnter 2 for given admission into commerce: ");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                ScienceStudents obj = new ScienceStudents();
            case 2:
                CommerceStudents obj1 = new CommerceStudents();
        }
    }
}