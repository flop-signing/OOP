package Properties.Inheritance;

public class BoxWeight extends Box{
    double weight;


    static void greetings()
    {
        System.out.println("Hey, I am in box class.");
    }

    BoxWeight(double length,double width,double weight)
    {
        super(length,width);
        this.weight=weight;
    }

    BoxWeight(BoxWeight other)
    {

        // This is a copy constructor
        super(other);
        weight=other.weight;
    }

    BoxWeight(double side,double weight)
    {
        super(side);
        this.weight=weight;
    }

    BoxWeight(double length, double height, double width, double weight) {
        super(length, height, width); // what is this? This is basically, call the parent class constructor;
        // this is initialized the values that are present in the parent class;
        this.weight = weight;
        System.out.println(super.height); // if there are same variable in both parent and child class then we can access parent class member using super.name instead of this.name
    }


    public static void main(String[] args) {
        BoxWeight boxWeight=new BoxWeight(2,3,4);

    }
}
