public class breakStatement{
    public static void main(String args[]){

        int num = 1;

        // while(num<=10){
        //     System.out.println(num);
        //     num++;
        //     if(num==6){
        //         break; // used to exit from loop
        //     }
        // }

        while(num <= 10) {
            if(num == 6) {
                num++;
                continue; //skip the current iteration
            }
            System.out.println(num);
            num++;
        }


    }
}