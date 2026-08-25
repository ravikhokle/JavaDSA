import java.util.*;
public class InputString{
    public static void main(String args[]){
        String str = new String("");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        //str = sc.next(); take only one word.
        str = sc.nextLine(); // take all words.
        System.out.print(str);
    }
}