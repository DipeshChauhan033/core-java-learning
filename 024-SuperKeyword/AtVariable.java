class color{
    String cName;
    color(){
        cName = "White";
    }
}

class color2 extends color{
    String cName;;
    color2(){
        cName = "Black";
        System.out.println("Color Name of super class: "+super.cName);
        System.out.println("Color Name of sub class: "+cName);
    }
}

public class AtVariable{
    public static void main(String[] args){
        color2 obj = new color2();
    }
}