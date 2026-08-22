import java.util.*;

public class primeNumFun{

//     public static boolean checkPrime(int n){
//         if(n==2){
//             return true;
//         }
//         for(int i=2; i<=n-1; i++){
//             if(n%i==0){
//                 return false;
//             }
//         }
//         return true;
// }


public static boolean checkPrime(int n){
    if(n==2){
        return true;
    }
    for(int i=2; i<=Math.sqrt(n); i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
}

public static void primeInRange(int n){
    for(int i=2; i<=n; i++){
        if(checkPrime(i)){
          System.out.print(" "+i);  
        }
    }
}


    public static void main(String args[]){

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number: ");
        // int n = sc.nextInt();


        // boolean prime = checkPrime(n);
        // if(prime){
        //     System.out.println("Number is Prime");
        // }else{
        //     System.out.println("Number is Not Prime");
        // }

        primeInRange(20);


    }
}