import java.util.*;

public class StringJoiner_methods{
    public static void main(String[] args){
        
        StringJoiner sj = new StringJoiner(",");

        sj.add("Apple");
        sj.add("Banana");
        sj.add("Orange");

        System.out.println("StringJoiner: "+sj);

        String str;
        str = sj.toString();
        System.out.println("From string class: "+str);
        
        //Stringjoiner(charSequence,charSequence prefix, charSequence suffix)
        StringJoiner sj2 = new StringJoiner(",","(",")");

        sj2.add("White");
        sj2.add("Red");
        sj2.add("Black");

        System.out.println("StringJoiner(prefix,suffix): "+ sj2);

        //StringJoiner Merge(StringJoiner other)
        StringJoiner sj3 = new StringJoiner(",","[","]");
        sj3.add("mercury");
        sj3.add("venus");
        sj3.add("earth");
        sj3.add("mars");

        StringJoiner sj4 = new StringJoiner(",");
        sj4.add("jupiter");
        sj4.add("saturn");
        sj4.add("uronus");
        sj4.add("neptune");

        sj3.merge(sj4);
        System.out.println("StringJoiner(merge): "+sj3);

        //StringJoiner  setEmptyValue(Message)
        StringJoiner sj5 = new StringJoiner(",");

        sj5.setEmptyValue("No value");

        System.out.println("StringJoiner(setEmptyValue): "+sj5);
    }
}