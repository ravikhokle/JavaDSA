public class typeConversion{
    public static void main(String args[]){
        
        // 1. Implicit type conversion
        // java does automatically
        // type must be compatible
        // example

        int a = 50;
        float b = a;
        System.out.println(b);

        // a automaticaly coverted into float by java.
        // destination data type must be greater than souce. means reciver data type must be greater.


        // 2. Explicit type conversion
        // user does it forcefully
        // data may be loss
        // example

        float marks = 99.99f;
        int finalMarks = (int) marks;
        System.out.println(finalMarks);

        // here .99 data loss 

    }
}