package Properties.Introduction;

public class Main {


    public static void main(String[] args) {
        Student sabu=new Student();
        sabu.greeting();
    }
}
class Student{
    int rollNo;
    String name;
    float marks;

    void greeting()
    {
        System.out.println("Hello, This is "+this.name);
    }



    void changeName(String name)
    {
        this.name=name;
    }

//    Student()
//    {
//        this.rollNo=34;
//        this.name="Saba";
//        this.marks=97f;
//    }


    // Call a constructor from another constructor
    Student()
    {
        // internally this works like
        this(34,"Default",100.0f);
    }

    public Student(int rollNo, String name, float marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    Student(Student other)
    {
        this.name=other.name;
        this.rollNo=other.rollNo;
        this.marks=other.marks;
    }

}