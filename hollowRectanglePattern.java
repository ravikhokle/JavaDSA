// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class hollowRectanglePattern{

    // public static void hollowPattern(int tRow, int tCol){
    //     for(int i=1; i<=tRow; i++){
    //         for(int j=1; j<=tCol; j++){
    //             if(i==1 || i==tRow || j==1 || j==tCol){
    //                 System.out.print("*");
    //             }else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }


    public static void hollowPattern(int l){
        for(int i=0; i<=l; i++){
            for(int j=0; j<l+1; j++){
                if(i==0 || i==l || j==0 || j==l){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        //hollowPattern(5,10);
        hollowPattern(4);
    }
}