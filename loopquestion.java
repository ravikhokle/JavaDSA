import java.util.*;

public class loopquestion {
public static void main(String[] args){

// for(int i=0; i<5; i++) {
// System.out.println("Hello");
// i+=2;
// }

// Write a program that reads a set of integers, and then prints the sum of the
// even and odd integers.

// Scanner sc = new Scanner(System.in);
// int num, evenSum=0, oddSum=0, hold;

// System.out.println("Enter the number: ");
// num = sc.nextInt();

// while(num>0){
//     hold = num % 10;  // get last digit

//     if(hold%2==0){
//         evenSum= evenSum + hold;
//     }else{
//         oddSum= oddSum + hold;
//     }
//     num = num / 10; // remove last digit
// }

// System.out.println("Sum of Even: "+ evenSum);
//     System.out.println("Sum of Odd: "+ oddSum);


// Write a program to print the multiplication table of a number N, entered by the user

Scanner sc = new Scanner(System.in);
int num;

System.out.println("Enter the number: ");
num = sc.nextInt();

for(int i=1;i<=10;i++){
    System.out.println(num + "x" + i + "=" + num*i);
}

}
}
