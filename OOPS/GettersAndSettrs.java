public class GettersAndSettrs{
    public static void main(String args[]){
        Pen p1 = new Pen();

        p1.setColor("Red");
        System.out.println(p1.getColor());  

        p1.setTip(5);
        System.out.println(p1.getTip());
    }
}

class Pen{
    private int tip;
    private String color;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String color){
        this.color = color;
    }
    
    void setTip(int tip){
        this.tip=tip;
    }

}