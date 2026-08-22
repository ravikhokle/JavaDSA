import java.util.*;

public class digitSumFun{

    public static int sumofdigits(int digit){
        int sum=0;
        while(digit>0){
            sum += digit%10;
            digit /= 10;
        }
        return sum;
    }

    public static void main(String args[]){
        System.out.print("Sum of Digits: "+ sumofdigits(2653));
    }
}