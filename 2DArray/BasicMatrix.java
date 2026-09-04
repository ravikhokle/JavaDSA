import java.util.*;

public class BasicMatrix{

    public static void takeInput(int matrix[][]){
        Scanner sc = new Scanner(System.in);

        int m=matrix.length;
        int n=matrix[0].length;
        System.out.println("Enter value: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(" "+ matrix[i][j]);
            }  
        }

    }

    public static void main(String args[]){
        int matrix[][] = new int[2][2];
        takeInput(matrix);
    }
}