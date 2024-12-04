package Properties.Cloning;

public class Human {
    int age;
    String name;
    int[] arr;
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr=new int[]{3,5,1,6,7,4};
    }

    public Human(Human other) {
        this.age=other.age;
        this.name=other.name;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
