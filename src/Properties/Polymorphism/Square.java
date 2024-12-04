package Properties.Polymorphism;

public class Square extends Shapes{
    @Override  // this is called annotation by which we check if a method is override or not.
    void area()
    {
        System.out.println("Area is Square.");
    }
}
