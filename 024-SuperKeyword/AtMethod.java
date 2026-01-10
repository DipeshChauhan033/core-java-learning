class color{
    void color(){
        String color = "White";
        System.out.println("Color from super class: "+color);
    }
}

class color2 extends color{
    void color(){
        super.color();
        String color = "Black";
        System.out.println("Color from sub class: "+color);
    }
}

public class AtMethod{
    public static void main(String[] args){
        color2 obj = new color2();
        obj.color();
    }
}
