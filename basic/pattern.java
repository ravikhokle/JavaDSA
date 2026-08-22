public class pattern{
    public static void main(String[] args){

        for(int line=1; line<=4; line++){
            for(int star=1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        for(int line=4; line>=1; line--){
            for(int star=line; star>=1; star--){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        for(int line=1; line<=4; line++){
            for(int n=1; n<=line; n++){
                System.out.print(n);
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        char ch = 'A';
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println(" ");
        }


    }
}