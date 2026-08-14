public class KadanesMaxArray{

    public static void kedance(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0; i<numbers.length; i++){
            sum = sum + numbers[i];
            if(sum<0){
                sum=0;
            }
            ms = Math.max(sum, ms);
        }
        System.out.print("Max subarray sum is: "+ ms);
    }

    public static void main(String args[]){
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kedance(numbers);
    }
}