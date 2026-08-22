import java.util.*;
public class ArrayPractice{

    public static void main(String args[]){

        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        
        //System.out.print("Enter a number: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = (int)(Math.random() * 10);
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();

        int min=arr[0];
        int max=arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
                continue;
            }
            if(arr[i]<min)
            min=arr[i];
            
        }

        System.out.println("Min: "+ min);
        System.out.println("Max: "+ max);
        




    }
}