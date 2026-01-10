class color{
    String cName;
    color(String cName){
        this.cName = cName;
    }
}

class color2 extends color{
    String cName;;
    color2(String cName){
        this.cName = cName;
        super("White");
        System.out.println("Color Name of super class: "+super.cName);
        System.out.println("Color Name of sub class: "+cName);
    }
}

public class AtConstructor{
    public static void main(String[] args){
        color2 obj = new color2("Black");
    }
}