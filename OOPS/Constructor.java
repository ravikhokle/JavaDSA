public class Constructor{
    public static void main(String args[]){
        Student s0 = new Student(); // object for Non - Parameterized Constructor
        Student s1 = new Student("Ravi", 52039); // object for Parameterized Constructor
        s1.password = "ABCD";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;

        Student s2 = new Student(s1); // object for Copy Constructore copying s1 
        s2.password = "XYZ";

        s1.marks[2]=50;

        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];

    // Non - Parameterized
    Student(){
        marks = new int[3];
        System.out.println("Non - Parameterized Constructure is called.");
    }

    // Parameterized
    Student(String name, int roll){
        this.name = name;
        this.roll = roll;
        marks = new int[3];
        System.out.println("Name:" + this.name + " Roll:" + this.roll);
    }

    // Shallow  Copy Constructor
    // Student(Student s1){
    //     marks = new int[3];  
    //     // coping shallow copy means using reference
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    // Deep Copy Constructor, copying value not ref
    Student(Student s1){
        marks = new int[3];  
        this.name = s1.name;
        this.roll = s1.roll; 
        for(int i=0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }   
    }

}