public class ReverseArray{

    // public static void reverse(int numbers[]){
    //     int first=0, last=numbers.length-1;
    //     while(first < last){
    //         int temp=numbers[first];
    //         numbers[first] = numbers[last];
    //         numbers[last] = temp;
    //         first++;
    //         last--;
    //     }
    // }

    public static void reverseArray(int arr[]){
        int p=0; int q=arr.length-1;
        while(p<q){
            int temp=arr[p];
            arr[p]=arr[q];
            arr[q]=temp;
            p++;
            q--;
        }
    }

    public static void main(String args[]){
        int numbers[] = {2,4,8,10};

        System.out.println("Before Reverse");
        for(int i=0; i<numbers.length; i++){
            System.out.print(" "+ numbers[i]);
        }
        
        System.out.println("\nAfter Reverse");
        reverseArray(numbers);
        
        for(int i=0; i<numbers.length; i++){
            System.out.print(" "+ numbers[i]);
        }
    }
}