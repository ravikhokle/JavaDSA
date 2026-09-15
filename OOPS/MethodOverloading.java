public class MethodOverloading{
    public static void main(String args[]){
        Substraction s = new Substraction();
        System.out.println(s.sum(10,20));
        System.out.println(s.sum(10.5f,5.5f));
        System.out.println(s.sum(10,20,30));
    }
}

class Substraction{

    int sum(int a, int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

}

