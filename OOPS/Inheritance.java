public class Inheritance{
    public static void main(String args[]){

        // Fish shark = new Fish();
        // shark.eat();

        // multi level inheritance.
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.print(dobby.legs);

    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("Eats");
    }
}

// class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.print("Swims in water");
//     }
// }

class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal{
    String breed;
}

// used for hybrid inheritance
class Human extends Mammal{
    Boolean Speak;
    
}