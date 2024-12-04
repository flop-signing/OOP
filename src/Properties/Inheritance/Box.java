package Properties.Inheritance;

public class Box {
   double length;
    double height;
    double width;

    Box()
    {
        this.length=-1;
        this.height=-1;
        this.width=-1;
    }

    Box(double length,double width)
    {
        this.length=length;
        this.width=width;
    }

    // If this is a Cube,Then

    Box(double side)
    {
        this.length=side;
        this.height=side;
        this.width=side;
    }

    public Box(double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    // Copy Constructor

    Box(Box old)
    {
        this.length=old.length;
        this.height=old.height;
        this.width=old.width;
    }


    public void information()
    {
        System.out.println("The box is running.");
    }
}
