package Properties.Polymorphism;


// Generally Two types of Polymorphism
// 1) Compile time polymorphism achieved by Method Overloading
// 2) Run Time Polymorphism achieved by Method Overriding

public class Main {
    public static void main(String[] args) {
        Shapes shape=new Shapes();

        Circle circles=new Circle();
        Square squares=new Square();
        Shapes circle=new Circle();
        Shapes square=new Square();
    }
}
