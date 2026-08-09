import java.util.*;
public class functions{

    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static int factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter first Num: ");
            int a = sc.nextInt();
            System.out.print("Enter second Num: ");
            int b = sc.nextInt();
            int ans = add(a,b);

            System.out.println("Sum: "+ans);

        
        System.out.print("Enter number to calculate Factorial: ");
        int n = sc.nextInt();
        System.out.print("Factorial: "+ factorial(n));
    }





}