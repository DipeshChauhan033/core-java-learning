import java.util.Scanner;

class show{
    final String name;
    int age;

    show(String name1,int age1){
        name = name1;
        age = age1;
    }

    String personDetail(){
        return name;
    }

    int personDetail2(){
        return age;
    }

    void checkFinal(String str){
        name = str;    //value of final variable cannot changed (cannot assign a value to final variable name)
    }

}

public class FinalAtVariable{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int i = 1;
        while(i!=0){
            System.out.print("Enter name: ");
            String user = sc.nextLine();

            System.out.print("Enter age: ");
            int userage = sc.nextInt();
            sc.nextLine();

            show obj = new show(user,userage);

            System.out.println(obj.personDetail()+" ");
            System.out.print(obj.personDetail2());
        }
    }
}