package Properties.AbstractExample;

public abstract class Parent {

    int age;

    public Parent(int age) {
        this.age = age;
    }


  // We can create static method in abstract class.

    static void Greeting()
    {
        System.out.println("Hey, ");
    }

 // We also can create normal method in abstract class

    void normal()
    {
        System.out.println("This is a normal class.");
    }

    abstract void Career();
    abstract void Partner();
}
