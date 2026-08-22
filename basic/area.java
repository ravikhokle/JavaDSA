import java.util.*;

public class area{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        float pi = 3.14f;
        float radius = sc.nextFloat();

        float area = pi * radius * radius;

        System.out.print(area); 
    }
}