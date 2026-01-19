package anagram_check;

import length.*;
import java.util.*;

public class AnagramLogic{
    public String str1;
    public String str2;
    public int s1length = 0;
    public int s2length = 0;
    public int count1 = 0;
    public int count2 = 0;


    public AnagramLogic(String str1,String str2){
        this.str1 = str1;
        this.str2 = str2;
    }

    public void check_anagram(){

        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        CheckLength obj = new CheckLength(str1);
        obj.length_num();
        s1length = obj.count;

        CheckLength obj2 = new CheckLength(str2);
        obj2.length_num();
        s2length = obj2.count;

        char[] carr1 = str1.toCharArray();
        char[] carr2 = str2.toCharArray();


        for(int i=0;i<carr1.length;i++){

            if(s1length != s2length){
                System.out.println("String are not anagram");
                break;
            }

            for(int j=0;j<carr1.length;j++){
                if(carr1[i] == carr1[j]){
                    count1++;
                }

                if(carr1[i] == carr2[j]){
                    count2++;
                }
            }
        }

        if(s1length == s2length){
            if(count1!=count2){
                    System.out.println("String are not anagram");
            }
            else{
                System.out.println("String is anagram");
            }
        }
        
    }
    
}
