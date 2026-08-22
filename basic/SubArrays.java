public class SubArrays{

    // Brut Force approach

    // public static void printSubArrays(int arr[]){
    //     int ts = 0;
    //     for(int i=0; i<arr.length; i++){
    //         for(int j=i; j<arr.length; j++){
    //             for(int k=i; k<=j; k++){
    //                 System.out.print(arr[k]+" ");
    //             }
    //             System.out.println();
    //             ts++;
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("Total Sub Arrays: "+ts);
    // }

    public static void maxSumOfSubArrays(int arr[]){
        int sum=0, maxSum=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                sum = 0;
                for(int k=i; k<=j; k++){
                    sum += arr[k];
                }
                System.out.println(sum);
                if(maxSum<sum){
                       maxSum = sum; 
                    }
            }
            System.out.println();
        }
        System.out.println("Total Sub Arrays: "+maxSum);
    }

    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        maxSumOfSubArrays(numbers);
    }
}