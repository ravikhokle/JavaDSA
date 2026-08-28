public class StringEquals{
    public static void main(String args[]){
        String name1 = "Ravi";
        String name2 = "Ravi";
        String name3 = new String("Ravi");

        // equal
        if(name1==name1){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        // not equal
        if(name1==name3){
            System.out.println("Strings are equal");
        }else{
           
            System.out.println("Strings are not equal");
        }

        // equal
        if(name1.equals(name3)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
   

    }
}