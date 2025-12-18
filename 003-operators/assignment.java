import java.util.Scanner;

public class assignment{
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int num1, num2, num3, num4;

        System.out.print("Enter num1: ");
        num1 = s.nextInt();

        System.out.print("Enter num2: ");
        num2 = s.nextInt();

        System.out.print("Enter num3: ");
        num3 = s.nextInt();

        System.out.print("Enter num4: ");
        num4 = s.nextInt();

        System.out.println("Num1: "+num1+" Num2: "+num2+" Num3: "+num3+ " num4: "+num4 + " Before assisgnment");

        num1+=10;
        num2-=6;
        num3*=10;

        num1/=2;
        num2<<=2; //Shift 2 time left side in binary

        num3>>=1;

        num4&=8;  //others: |=  (OR), ^= (XOR)

        System.out.println("Num1: "+num1+" Num2: "+num2+" Num3: "+num3+" num4: "+num4 + " After assisgnment");

    }
}