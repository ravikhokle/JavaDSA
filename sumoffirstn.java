import java.util.*;

public class sumoffirstn {
    public static void main(String args[]){
         int sum=0, i=1;
         
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the value of n: ");
         int n = sc.nextInt();
       
        while(i<=n){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of first n: " + sum);
    }

}