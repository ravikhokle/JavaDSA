public class FirstCharUpperCase{
    public static void convertFirstCharToUpper(String name){
        StringBuilder upperString = new StringBuilder("");

        char ch = Character.toUpperCase(name.charAt(0));
        upperString.append(ch); 

        for(int i=1; i<name.length(); i++){
            if(name.charAt(i)==' ' && i<name.length()-1){
                upperString.append(name.charAt(i));
                i++;
                upperString.append(Character.toUpperCase(name.charAt(i)));    
            }else{
                upperString.append(name.charAt(i));
            }
        }

        upperString.toString();
        System.out.println(upperString);
    }

    public static void main(String args[]){
        String name = "ravi khokle  ";
        convertFirstCharToUpper(name);
    }
}