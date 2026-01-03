import java.util.Scanner;

class countperson{
    String name;
    int age;
    static int count;

    countperson(String name,int age){
        this.name = name;
        this.age = age;
    }
    void person(){
        System.out.println("Person:"+name+" and age is:"+age);
        count++;
    }

    static int getCount(){
        return count;
    }
}

public class p3Static{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int i =1;
        

        while(i!=0){
            System.out.print("Enter 1 to enter details.., enter 2 to check total persons, enter 3 to exit: ");
            int choice = sc.nextInt();
            sc.nextLine();
                if(choice==1){
                    System.out.println("Enter name: ");
                    String s = sc.nextLine();

                    System.out.print("Enter age: ");
                    int  a = sc.nextInt();
                    
                    countperson obj = new countperson(s,a);
                    obj.person();
                }
                else if(choice==2){
                    System.out.println("Total persons: "+countperson.getCount());
                }
                else if(choice==3){
                    break;
                }
                else{
                    System.out.println("Invalid Input");
                }
        }
        
    }
}