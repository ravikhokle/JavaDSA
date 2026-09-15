public class MultipleInheritance{
    public static void main(String args[]){
        Bear b = new Bear();
        b.eatVeg();
        b.eatNonVeg();
    }
}

interface VegAnimal{
    void eatVeg();
}

interface NonVegAnimal{
    void eatNonVeg();
}

class Bear implements VegAnimal, NonVegAnimal{
    public void eatVeg(){
        System.out.println("Eats grass");
    }

    public void eatNonVeg(){
        System.out.println("Eats meat");
    }
}