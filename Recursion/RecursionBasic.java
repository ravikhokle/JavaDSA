public class RecursionBasic{

// print 10 to 1
public static void Recursion(int n){
    if(n==1){
        System.out.println(n);
        return;
    }
    System.out.println(n);
    Recursion(n-1);
}

public static void main(String args[]){
int n = 10;
Recursion(n);
}
}

