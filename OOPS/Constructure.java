public class Constructure{
    public static void main(String args[]){
        Pen newPen = new Pen("Red");
    }
}

class Pen{
    String Color;

    Pen(String Color){
        this.Color = Color;
        System.out.println("Constructure is called...");
        System.out.println(Color);
    }
}