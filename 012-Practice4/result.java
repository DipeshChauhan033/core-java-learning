import java.util.*;

class result{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of English:");
        double num1 = sc.nextDouble();
        System.out.print("Enter marks of Maths:");
        double num2 = sc.nextDouble();
        System.out.print("Enter marks of Science:");
        double num3 = sc.nextDouble();

        double cal = (num1+num2+num3)/3;
        if(num1>=50 && num2>=50 && num3>=50){
            if(cal>=75){
                System.out.println("Pass, your percentage is:"+cal);
            }
            else{
                System.out.println("Sorry percentage are not greater than 75");
            }
        }
        else if(num1<50){
             System.out.printf("Sorry your result is not publish, You are fail in English sub.");
             System.out.println();
        }
        else if(num2<50){
             System.out.printf("Sorry your result is not publish, You are fail in Maths sub.");
             System.out.println();

        }
        else if(num3<50){
             System.out.printf("Sorry your result is not publish, You are fail in Science sub.");
             System.out.println();

        }
    }
}