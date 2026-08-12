public class SecondMax{
    public static void main(String args[]){
        int arr[] = {5, 10, 11, 7, 8};
        int max=arr[0];
        int sMax=max;
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                sMax=max;
                max = arr[i];
               
            }
        }
        System.out.print(sMax);
    }
}