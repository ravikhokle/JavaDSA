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

    // nCr = n!/r!*(n-r)!
    public static int combination(int n, int r){
        int nfact = factorial(n);
        int rfact = factorial(r);
        int nmrfact = factorial(n-r);

        int nCr = nfact / (rfact*nmrfact);

        return nCr;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //     System.out.print("Enter first Num: ");
        //     int a = sc.nextInt();
        //     System.out.print("Enter second Num: ");
        //     int b = sc.nextInt();
        //     int ans = add(a,b);

        //     System.out.println("Sum: "+ans);

        
        // System.out.print("Enter number to calculate Factorial: ");
        // int n = sc.nextInt();
        // System.out.print("Factorial: "+ factorial(n));

        System.out.print("Combination: "+ combination(5,2));

    }

}