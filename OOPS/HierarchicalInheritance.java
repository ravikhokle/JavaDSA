public class HierarchicalInheritance{
    public static void main(String args[]){
        Mammal newMammal = new Mammal();
        newMammal.eat();
    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("Swim");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("Walk");
    }
}