public class LinearSearch{

    public static int LinearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int numbers[] = {10,20,30,40,50,60,70,25,45};
        int key = 50;
        int index = LinearSearch(numbers,key);
        if(index == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("Key Found at index: " + index);
        }
    }
}