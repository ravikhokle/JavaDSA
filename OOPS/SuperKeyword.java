public class SuperKeyword{
    public static void main(String args[]){
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor called");
    }
}

class Horse extends Animal{
    Horse(){
        super(); // call parent constructor, if not written then java automatically call it.
        System.out.println("Horse constructor called");
        super.color = "Brown";  // assign value to parent class variable using super keyword.
    }
}