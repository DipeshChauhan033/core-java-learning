public class associativity{
    public static void main(String[] args){
        //Precedence & Associativity

        int a = 50-2*60/5+6; // Highest precedence goes to * and /. They are then evaluated on the basis  
                             // of left to right associativity.

        /*
         Step1: 50-120/5+6
         Step2: 50-24+6     // Highest precedence goes to + and -. They are then evaluated on the basis  
                             // of left to right associativity. so first - and then +
         Step3: 26+6
         Step4: 32
        */

        System.out.println(a);

        int b = 120+62-12*2-60/5;

        /* 120+62-24-60/5
           120+62-24-12
           182-24-12
           158-12
           146
        */
       System.out.println(b);

       int x,y,z;
       x = y = z = 5;
       /*
       x = y = (z = 5)  Right to Left Associativity
       */

       System.out.println(x);

       int p = 6;
       int q = 12;
       int ans = p--&++q* 5 ;  //Right to Left;
       System.out.println(ans);


    }
}