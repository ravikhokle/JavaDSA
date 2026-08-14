public class MaxSubArrayPrefix{
public static void maxSumOfSubArrays(int arr[]){
        int sum=0, maxSum=0;
        int prefix[] = new int[arr.length];
        prefix[0]=arr[0];

        for(int i=1; i<prefix.length; i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                sum= i==0 ? prefix[j] : prefix[j] - prefix[i-1];
                if(maxSum<sum){
                       maxSum = sum; 
                    }
            }
        }
        System.out.println("Max Sum: "+maxSum);
    }

    public static void main(String args[]){
        int numbers[] = {1,-2,6,-1,3};
        maxSumOfSubArrays(numbers);
    }
}