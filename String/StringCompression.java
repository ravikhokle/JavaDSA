public class StringCompression{

    public static String compress(String str){
        StringBuilder compressedStr = new StringBuilder("");

        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }

            compressedStr.append(str.charAt(i));
            if(count>1){
              compressedStr.append(count.toString());
            }
        }  
        return compressedStr.toString();
    }

    public static void main(String args[]){
        String str = "aaaabbbccd";
        System.out.print(compress(str));
    }
}