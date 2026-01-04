class addition{

    static double sum(double ...arr){

        double result=0;

        for(double add : arr){
            result+=add;
        }

        return result;
    }
}

public class varArg{
    public static void main(String[] args){
        System.out.println("Addition of two no : "+addition.sum());
        System.out.println("Addition of two no : "+addition.sum(5,5));
        System.out.println("Addition of three no : "+addition.sum(5,5,5));
        System.out.println("Addition of four no : "+addition.sum(5,5,5,5));
        System.out.println("Addition of five no : "+addition.sum(5,5,5,5,5));
    }
}