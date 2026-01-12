class Animal{
    void move(){
        System.out.println("Animal can move");
    }
}

class Dog extends Animal{
    void move(){
        System.out.println("Dog can walk and run");
    }
}

public class MethodOverriding{
    public static void main(String[] args){
        Animal obj1 = new Animal();
        obj1.move();

        Animal obj2 = new Dog();
        obj2.move();

        Dog obj3 = new Dog();
        obj3.move();
    }
}