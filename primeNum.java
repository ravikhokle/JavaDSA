import java.util.*;

public class primeNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime=true;
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0){
               isPrime=false;
               break;
            }
        }
        if(isPrime){
             System.out.println("Prime number");
        }else{
            System.out.println("Not Prime number");
        }

    }
}