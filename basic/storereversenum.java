import java.util.*;

public class storereversenum{
    public static void main(String args[]){
        int num=123, lastDigit;
        int i, rev=0;

        while(num>0){
            lastDigit = num%10; // return last digit  
            num=num/10; // remove last digit
            rev = (rev*10) + lastDigit; // add last digit to the reversed number
            
        }
        System.out.print(rev);

    }
}