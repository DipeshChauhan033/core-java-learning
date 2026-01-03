/**
 * final method can be inherited but,
 * final method cannot be override
 */

import java.util.Scanner;

class Animal{
    final String animalName;

    Animal(String animalName){
        this.animalName = animalName;
    }

    final void animal(){
        System.out.println(animalName+" can eat");
    }
}

class Dog extends Animal{

    Dog(String name){
        super(name);
    }
    void animal(){  //final method can not be override : error, animal() in Dog cannot override animal() in Animal
        System.out.println("Dog can walk");
    }
}

public class FinalAtMethod{
    public static void main(String[] args){
        Dog obj = new Dog("Cat");
        obj.animal();
    }
}