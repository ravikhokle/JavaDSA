public class CheckOddEvenUsingBit{
    public static void oddEven(int num){
        int bitMap = 1;
        if((num & bitMap) == 0){
            System.out.println("Number is Even: "+num);
        }else{
            System.out.println("Number is Odd: "+num);
        }
    }

    public static void main(String args[]){
        oddEven(10);
        oddEven(6);
        oddEven(5);
        oddEven(3);
    }
}