package Practices.Person;

public class Person {
    private String name;
    private int age;

    public Person()
    {

    }
    public Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public int getAge()
    {
        return this.age;

    }
    public void setAge(int age)
    {
        this.age=age;
    }

    public void getDetails()
    {
        System.out.println("Name: "+name+", Age: "+age);
    }


    public static void main(String[] args) {
        Person p1=new Person("Mehedi",25);
        Person p2=new Person("Akash",20);
        p1.getDetails();
        p2.getDetails();
    }
}
