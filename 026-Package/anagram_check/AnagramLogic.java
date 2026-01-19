package anagram_check;

import length.*;
import java.util.*;

class anagramLogic{
    public String str1;
    public String str2;
    public int s1length = 0;
    public int s2length = 0;

    public anagramLogic(String str1,String str2){
        this.str1 = str1;
        this.str2 = str2;
    }
    public void check_anagram(){
        CheckLength obj = new CheckLength(str1);
        obj.length_num();
        s1length = obj.count;

        CheckLength obj2 = new CheckLength(str2);
        obj2.length_num();
        s2length = obj.count;

        if(s1length == s2length){
            
        }
    }
    
}
public class AnagramLogic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String: ");
        String s1 = sc.nextLine();

        System.out.print("Enter 2nd String: ");
        String s2 = sc.nextLine();
        
        anagramLogic obj = new anagramLogic(s1,s2);
        obj.check_anagram();
    }
}