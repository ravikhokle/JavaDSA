public class LargestString {
    public static void largestString(String[] str) {
       String largest = str[0];
       for(int i=1; i<str.length;i++){
        if(largest.compareTo(str[i])<0){
            largest=str[i];
        }
       }
       System.out.println("Largest: "+ largest);
    }

    public static void main(String args[]) {
        String[] str={"apple", "elephant", "banana","mango"};
        largestString(str);
    }
}