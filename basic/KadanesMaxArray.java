public class KadanesMaxArray{

    public static void kedance(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0; i<numbers.length; i++){
            sum = Math.max(numbers[i], sum + numbers[i]);
            ms = Math.max(sum, ms);
        }
        System.out.print("Max subarray sum is: "+ ms);
    }

    public static void main(String args[]){
        int numbers[] = {-2,-3,-1,-2,-1,-5,-3};
        kedance(numbers);
    }
}