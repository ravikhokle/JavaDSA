

public class LargestNumArray{

    public static int largestNumArray(int numbers[]){
        int largest=numbers[0];
        for(int i=1; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String args[]){
        int numbers[] = {10,20,90,40,50,60,70,25,45};
        int largest = largestNumArray(numbers);
        System.out.println("Largest Number is: "+largest);
    
    }
}