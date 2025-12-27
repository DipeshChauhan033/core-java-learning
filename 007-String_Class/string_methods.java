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

        //using operator (==) : not for user inputs bcz objects make diffrent
        String var1 = "dipesh";
        String var2 = "dipesh";
        System.out.printf("%s same with %s? "+(var1 == var2),var1,var2);
        System.out.println(); //for gape
        System.out.println(); //for gape

        //equalsIgnoreCase(String anotherString);
        System.out.print("Enter name to match with above entered name: ");
        String name2 = sc.nextLine();

        String check2 = (name2.equalsIgnoreCase(s1))?"Yes same":"Not same";
        System.out.format("1st name- %s is, %s with this name- %s(No matter any case)",s1,check2,name2);
        System.out.println();
        System.out.println();

        //indexOf(char)
        System.out.print("Enter char to check begin index: ");
        char ch = sc.next().charAt(0);
        System.out.printf("First occurs %c at index number is: "+s1.indexOf(ch),ch);
        System.out.println();
        System.out.println();

        //indexOf(char,int index) start checking from given index
        System.out.print("Enter char to check begin index: ");
        char ch2 = sc.next().charAt(0);
        
        System.out.print("Enter index number, when you want to start to check: ");
        int num5 = sc.nextInt();

        System.out.printf("occurs %c after index number-%d at index number: "+s1.indexOf(ch2,num5),ch2,num5);
        System.out.println();
        System.out.println();

        sc.nextLine();

        //lastIndexOf(char)
        System.out.print("Enter char to check last index: ");
        char ch5 = sc.next().charAt(0);
        System.out.printf("last occurs %c at index number is: "+s1.lastIndexOf(ch5),ch5);
        System.out.println();
        System.out.println();

        sc.nextLine();

        //lastIndexOf(char,int index)
        System.out.print("Enter char to check last index: ");
        char ch6 = sc.next().charAt(0);
        
        System.out.print("Enter index number, when you want to start for checking: ");
        int num6 = sc.nextInt();

        System.out.printf("occurs %c after index number-%d at index number: "+s1.lastIndexOf(ch6,num6),ch6,num6);
        System.out.println();
        System.out.println();

        sc.nextLine();



        //toLowerCase()
        System.out.print("Enter string to convert into lower case: ");
        String str = sc.nextLine();

        System.out.printf("Upper case string: %s is in lower case String: "+ str.toLowerCase(),str);
        System.out.println();
        System.out.println();


        //toUpperCase()
        System.out.print("Enter string to convert into upper case: ");
        String str2 = sc.nextLine();

        System.out.printf("lower case string: %s is in upper case String: "+ str2.toUpperCase(),str2);
        System.out.println();
        System.out.println();

        //replace(new char,char)
        System.out.print("Enter string: ");
        String str3 = sc.nextLine();

        System.out.print("Enter char to replace: ");
        char ch3 = sc.next().charAt(0);

        System.out.print("Enter char to replace with: ");
        char ch4 = sc.next().charAt(0);

        System.out.printf("%c is replce with %c: "+str3.replace(ch3,ch4),ch3,ch4);
        System.out.println();
        System.out.println();

        sc.nextLine();

        //compareTo -- return int output (rules book no. 95)
        System.out.print("Enter string to compare with old string: ");
        String str4 = sc.nextLine();

        int sum = (str4.compareTo(s1));

        String str5 = (sum==0)?"same" : "not same";

        System.out.printf("Output is %d so string is %s with old string ",sum,str5);
        System.out.println();
        System.out.println();


        //contains(char)
        System.out.print("Enter char to check string contains or not: ");
        String ch7 = sc.nextLine();

        System.out.printf("%s is include into %s ?"+ s1.contains(ch7),ch7,s1);
        System.out.println();
        System.out.println();

        //trim()
        System.out.print("Enter string(to remove white space from begging and end): ");
        
        String str6 = sc.nextLine();
        System.out.println("Length before trim: "+str6.length());

        String str7 = str6.trim();
        System.out.println("white space removed from string: "+str7);

        System.out.println("Length After trim: "+str7.length());
        System.out.println();
        System.out.println();

        //startsWith(string)
        System.out.print("Enter string: ");
        String str8 = sc.nextLine();
        System.out.print("Enter starting char to check: ");
        String str9 =  sc.nextLine();

        System.out.println("Output: "+str8.startsWith(str9));
        System.out.println();
        System.out.println();

        //endsWith(string)
        System.out.print("Enter string: ");
        String str10 = sc.nextLine();
        System.out.print("Enter Ending char to check: ");
        String str11 =  sc.nextLine();

        System.out.println("Output: "+str10.endsWith(str11));
        System.out.println();
        System.out.println();

        //spilt()
        System.out.print("Enter name to split: ");
        String str12 = sc.nextLine();
        String[] space = str12.split(" ");

        for(String f : space){
            System.out.println(f);
        }
        
        System.out.println();
        System.out.println();



    }
}