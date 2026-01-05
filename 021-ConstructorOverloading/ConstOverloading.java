import java.util.Scanner;

class studentDetails{
    static int count;
    studentDetails(String name,int eno){
        System.out.println("Student name: "+name+" enrolment no: "+eno);
        System.out.println();
    }

    studentDetails(String college,String program,String branch){
        System.out.println("College is "+college+" and program/branch is: "+program+" ,"+branch);
        System.out.println();
    }

}

public class ConstOverloading{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        
        int i=1;
        while(i!=0){
            System.out.print("Enter 1 for initialize Name&EnrolmentNo or Academic details\nEnter 2 for check how many students enroll\nEnter 3 for stop: ");
            int choice = sc.nextInt();
            System.out.println();
            sc.nextLine();
            if(choice==1){
                System.out.print("Enter name of student: ");
                String name = sc.nextLine();

                System.out.print("Enter enrolment of student: ");
                int eno = sc.nextInt();
                sc.nextLine();

                studentDetails obj = new studentDetails(name,eno);

                System.out.print("Enter name of college: ");
                String cname = sc.nextLine();

                System.out.print("Enter name of program: ");
                String pname = sc.nextLine();

                System.out.print("Enter name of branch: ");
                String bname = sc.nextLine();

                studentDetails obj2 = new studentDetails(cname,pname,bname);
                studentDetails.count++;
            }
            else if(choice==2){
                System.out.println("Total Students: "+studentDetails.count);
            }
            else if(choice==3){
                System.out.println("Thank You!");
                break;
            }

        }
    }
}