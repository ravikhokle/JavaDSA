public class StaticKeyword{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.collegName = "Modern college of engineering, Pune";
        Student s2 = new Student();
        System.out.println(s2.collegName); // using same memory of collegename variable.
    }
}

class Student{
    static String collegName;
    
    int percentage(int math, int phy, int chem){
        return (math + phy + chem) / 3;
    }
}