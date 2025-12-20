import java.util.Scanner;

public class string_methods{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //length()
        System.out.print("Enter your name to check length: ");
        String s1 = sc.nextLine();

        System.out.printf("length of the your name '%s' is: "+s1.length(),s1);
        System.out.println(); //for gape
        System.out.println(); //for gape

        //charAt(int index)
        System.out.print("Enter specific index to check that character: ");
        int num = sc.nextInt();
        System.out.printf("%d character in your name is: "+s1.charAt(num),num);
        System.out.println(); //for gape
        System.out.println(); //for gape

        //substring(int beginindex)
        System.out.print("Enter index number to split from starting: ");
        int num2 = sc.nextInt();
        System.out.printf("substring after %d index split: "+ s1.substring(num2),num2);
        System.out.println(); //for gape
        System.out.println(); //for gape

        //substring(int beginindex, int endindex)
        System.out.print("Enter index number to split from starting: ");
        int num3 = sc.nextInt();
        System.out.print("Enter index number to stop spliting(End): ");
        int num4 =  sc.nextInt();

        System.out.printf("Name after start index- %d and end index- %d :"+ s1.substring(num3,num4),num3,num4);

        System.out.println(); //for gape
        System.out.println(); //for gape

        sc.nextLine();

        //equals(Object anotherString)
        System.out.print("Enter name to match with above entered name: ");
        String name = sc.nextLine();
        
        String check = (name.equals(s1))?"Yes same":"Not same";
        System.out.format("1st name- %s is, %s with this name- %s",s1,check,name);

        System.out.println(); //for gape
        System.out.println(); //for gape

        //equalsIgnoreCase(String anotherString);
        System.out.print("Enter name to match with above entered name: ");
        String name2 = sc.nextLine();

        String check2 = (name.equalsIgnoreCase(s1))?"Yes same":"Not same";
        System.out.format("1st name- %s is, %s with this name- %s(No matter any case)",s1,check2,name2);


    }
}