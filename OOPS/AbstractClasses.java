public class AbstractClasses{
    public static void main(String args[]){
        Horse h = new Horse();
        // connot create object of abstract class animal
        h.eat();
        h.walk();
        // Animal class constructor called first.
    }
}

abstract class Animal{ // abstract class

    Animal(){
        System.out.println("Animal drinks water");
    }

    void eat(){
        System.out.println("Animal eats");
    }

    abstract void walk(); // abstract method
}

class Horse extends Animal{

    Horse(){
        System.out.println("Horse drinks water");
    }
    
    void walk(){
        System.out.println("Walk on 4 legs");
    }
}