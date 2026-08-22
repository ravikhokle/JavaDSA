import java.util.*;

public class forloop{
    public static void main(String args[]){
        int i, n, sum=0;

        System.out.println("Enter N");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        for(i=1;i<=n;i++){
            sum += i;
        }
        System.out.println(sum);
    }
}