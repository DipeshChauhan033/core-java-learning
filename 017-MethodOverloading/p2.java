class addition{

    static int sum(int a,int b){
        return a+b;
    }

    static int sum(int a,int b,int c){
        return a+b+c;
    }

    static void sum(int a,int b){  //diffrent return type is not called overloading(it gives error)
         System.out.print(a+b);
    }
}

public class p2{
    public static void main(String[] args){

        System.out.println("Addition of two number: "+addition.sum(5,5));

        System.out.println("Addition of three number: "+addition.sum(5,5,5));

        addition.sum(5,5);
       
    }
}