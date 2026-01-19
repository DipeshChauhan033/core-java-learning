import anagram_check.AnagramLogic;
import java.util.Scanner;

public class CheckAnagram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String: ");
        String str1 = sc.nextLine();

        System.out.print("Enter 2nd String: ");
        String str2 = sc.nextLine();

        AnagramLogic obj = new AnagramLogic(str1,str2);
        obj.check_anagram();
    }
}