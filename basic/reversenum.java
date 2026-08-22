import java.util.*;

public class reversenum{
    public static void main(String args[]){
        int num=123, d;
        int i;

        while(num>0){
            d = num%10; // return last digit 
            System.out.print(d);
            num=num/10; // remove last digit
        }

    }
}